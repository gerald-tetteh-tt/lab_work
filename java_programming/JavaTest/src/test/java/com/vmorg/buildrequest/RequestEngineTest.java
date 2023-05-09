package com.vmorg.buildrequest;

import com.vmorg.auth.AuthorisingService;
import com.vmorg.build.SystemBuildService;
import com.vmorg.exceptions.InvalidHostnameException;
import com.vmorg.exceptions.MachineNotCreatedException;
import com.vmorg.exceptions.UserNotEntitledException;
import com.vmorg.machine.Desktop;
import com.vmorg.machine.Machine;
import com.vmorg.machine.Server;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RequestEngineTest {
    private RequestEngine underTest;
    private Desktop desktop;
    private Server server;

    @Mock
    private AuthorisingService authorisingService;

    @Mock
    private SystemBuildService systemBuildService;

    @BeforeEach
    void setUp() throws InvalidHostnameException {
        underTest = new RequestEngine(authorisingService,systemBuildService);
        desktop = new Desktop(
                "host20230328005",
                "gerald-tetteh",
                2, 2, 12,
                11, "21H2"
        );
        server = new Server(
                "host20230328005",
                "gerald-tetteh",
                2, 2, 12,
                "Ubuntu", 18,
                "KL25Z", "Email Team"
        );
    }

    @Test
    void testFailedAuthorization() {
        when(authorisingService.isAuthorised(anyString())).thenReturn(false);
        assertThrows(UserNotEntitledException.class, () -> underTest.createNewRequest(desktop));
    }

    @Test
    void testSuccessfulAuthorization() {
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);
        when(systemBuildService.createNewMachine(any(Machine.class))).thenReturn("host20230328005");
        assertDoesNotThrow(() -> underTest.createNewRequest(desktop));
    }

    @Test
    void testFailedSystemBuild() {
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);
        when(systemBuildService.createNewMachine(any(Machine.class))).thenReturn("");
        assertThrows(MachineNotCreatedException.class, () -> underTest.createNewRequest(desktop));
        assertEquals(1,underTest.totalFailedBuildsForDay());
    }

    @Test
    void successfulSystemBuild() {
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);
        when(systemBuildService.createNewMachine(any(Machine.class))).thenReturn("host20230328005");
        assertDoesNotThrow(() -> underTest.createNewRequest(desktop));
    }

    @Test
    void testNewUserBuildRecorded() throws MachineNotCreatedException, UserNotEntitledException {
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);
        when(systemBuildService.createNewMachine(any(Machine.class))).thenReturn("host20230328005");
        underTest.createNewRequest(desktop);
        var buildsForDay = underTest.totalBuildsByUserForDay();
        assertTrue(buildsForDay.containsKey(desktop.getNameOfRequester()));
        var buildData = buildsForDay.get(desktop.getNameOfRequester());
        assertEquals(1,buildData.size());
    }

    @Test
    void testExistingUserBuildRecorded() throws MachineNotCreatedException, UserNotEntitledException {
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);
        when(systemBuildService.createNewMachine(any(Machine.class))).thenReturn("host20230328005");
        underTest.createNewRequest(desktop);
        underTest.createNewRequest(desktop);
        var buildsForDay = underTest.totalBuildsByUserForDay();
        assertEquals(1,buildsForDay.size());
        var buildData = buildsForDay.get(desktop.getNameOfRequester());
        assertEquals(1,buildData.size());
        var buildCount = buildData.get(desktop.getMachineType());
        assertEquals(2,buildCount);
    }

    @Test
    void testDifferentMachineTypeBuild() throws MachineNotCreatedException, UserNotEntitledException {
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);
        when(systemBuildService.createNewMachine(any(Machine.class))).thenReturn("host20230328005");
        underTest.createNewRequest(desktop);
        underTest.createNewRequest(server);
        var buildsForDay = underTest.totalBuildsByUserForDay();
        var buildData = buildsForDay.get(server.getNameOfRequester());
        assertEquals(2,buildData.size());
    }
}
package com.vmorg.buildrequest;

import com.vmorg.auth.AuthorisingService;
import com.vmorg.build.SystemBuildService;
import com.vmorg.exceptions.MachineNotCreatedException;
import com.vmorg.exceptions.UserNotEntitledException;
import com.vmorg.machine.Machine;

import java.util.HashMap;
import java.util.Map;

public class RequestEngine implements VirtualMachineRequester {
    private final AuthorisingService authorisingService;
    private final SystemBuildService systemBuildService;
    private final Map<String, Map<String,Integer>> totalUserBuildsForDay;
    private int failedBuildsForDay = 0;

    public RequestEngine(AuthorisingService authorisingService,
                         SystemBuildService systemBuildService) {
        this.authorisingService = authorisingService;
        this.systemBuildService = systemBuildService;
        totalUserBuildsForDay = new HashMap<>();
    }

    @Override
    public void createNewRequest(Machine machine) throws UserNotEntitledException, MachineNotCreatedException {
        if(!authorisingService.isAuthorised(machine.getNameOfRequester())) {
            throw new UserNotEntitledException("User can not create this machine");
        }
        String result = systemBuildService.createNewMachine(machine);
        if(result.isEmpty()) {
            failedBuildsForDay += 1;
            throw new MachineNotCreatedException("Could not create machine");
        }
        recordSuccessfulBuild(machine);
    }

    private void recordSuccessfulBuild(Machine machine) {
        // build successful
        if(totalUserBuildsForDay.containsKey(machine.getNameOfRequester())) {
            // if user has already requested a build today
            Map<String, Integer> buildData = totalUserBuildsForDay.get(machine.getNameOfRequester());
            if(buildData.containsKey(machine.getMachineType())) {
                // machine of this type has been created before
                int machineBuildCount = buildData.get(machine.getMachineType());
                machineBuildCount += 1;
                // update build count
                buildData.put(machine.getMachineType(),machineBuildCount);
            } else {
                buildData.put(machine.getMachineType(),1);
            }
        } else {
            // if user is making their first build
            Map<String, Integer> buildData = new HashMap<>();
            buildData.put(machine.getMachineType(),1);
            totalUserBuildsForDay.put(machine.getNameOfRequester(),buildData);
        }
    }

    @Override
    public Map<String, Map<String, Integer>> totalBuildsByUserForDay() {
        return totalUserBuildsForDay;
    }

    @Override
    public int totalFailedBuildsForDay() {
        return failedBuildsForDay;
    }
}

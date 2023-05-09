package io.turntabl.io.hotel;

import io.turntabl.io.exception.RoomAlreadyRegisteredException;
import io.turntabl.io.exception.RoomCapacityExceededException;
import io.turntabl.io.exception.RoomNotAvailableException;
import io.turntabl.io.room.DoubleRoom;
import io.turntabl.io.room.Suite;
import io.turntabl.io.room.Twin;
import io.turntabl.io.service.RoomPricingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ENSHotelImplTest {
    @Mock
    private RoomPricingService roomPricingService;
    private ENSHotelImpl underTest;
    private DoubleRoom doubleRoom;
    private Suite suite;
    private Twin twin;

    @BeforeEach
    void setUp() {
        underTest = new ENSHotelImpl(roomPricingService);
        doubleRoom = new DoubleRoom(221,10);
        suite = new Suite(22,7);
        twin = new Twin(77,55);
    }
    void guestAndValueSetUp() throws RoomAlreadyRegisteredException {
        underTest.addRoom(suite);
        underTest.addRoom(twin);
        underTest.addRoom(doubleRoom);
        // mock stub
        when(roomPricingService.price(anyInt())).thenReturn(20.0);
        when(roomPricingService.price(anyInt(),anyBoolean()))
                .thenReturn(10.0)
                .thenReturn(15.0);
        underTest.bookRoom(suite,3,true);
        underTest.bookRoom(twin,2,true);
        underTest.bookRoom(doubleRoom,2,true);
    }

    @Test
    void testCanAddRoom() throws RoomAlreadyRegisteredException {
        underTest.addRoom(doubleRoom);
        assertEquals(1,underTest.getHotelRooms().size());
        assertFalse(underTest.getHotelRooms().get(doubleRoom));
    }

    @Test
    void testThrowExceptionOnDuplicateRoom() throws RoomAlreadyRegisteredException {
        underTest.addRoom(doubleRoom);
        assertThrows(RoomAlreadyRegisteredException.class,() -> underTest.addRoom(doubleRoom));
    }

    @Test
    void testCanBookRoom() throws RoomAlreadyRegisteredException {
        // mock stub
        when(roomPricingService.price(anyInt())).thenReturn(20.0);
        when(roomPricingService.price(anyInt(),anyBoolean())).thenReturn(10.0);
        underTest.addRoom(suite);
        underTest.addRoom(twin);
        underTest.bookRoom(suite,2,true);
        underTest.bookRoom(twin,2,false);

        assertEquals(20.0,suite.getRatePerNight());
        assertEquals(2,suite.getNumberOfGuests());
        assertTrue(underTest.getHotelRooms().get(suite));

        assertEquals(10.0,twin.getRatePerNight());
        assertEquals(2,twin.getNumberOfGuests());
        assertTrue(underTest.getHotelRooms().get(twin));
    }

    @Test
    void testThrowExceptionOnUnavailableRoom() {
        assertThrows(RoomNotAvailableException.class,
                () -> underTest.bookRoom(twin,2,true));
    }

    @Test
    void testThrowExceptionForExceededRoomCapacity() throws RoomAlreadyRegisteredException {
        underTest.addRoom(twin);
        assertThrows(RoomCapacityExceededException.class,
                () -> underTest.bookRoom(twin,5,true));
    }

    @Test
    void testTotalGuestForToday() throws RoomAlreadyRegisteredException {
        guestAndValueSetUp();
        int totalGuests = underTest.totalGuestsForToday();
        assertEquals(7,totalGuests);
    }

    @Test
    void testTotalBookingsValue() throws RoomAlreadyRegisteredException {
       guestAndValueSetUp();
       double totalBookingValue = underTest.totalValueOfBookingsForToday();
       assertEquals(45.0,totalBookingValue);
    }
}
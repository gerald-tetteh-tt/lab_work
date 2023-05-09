package io.turntabl.io.room;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    private Room doubleRoom;
    private Room secondDoubleRoom;
    private Room thirdDoubleRoom;

    @BeforeEach
    void setUp() {
        doubleRoom = new DoubleRoom(55, 3);
        secondDoubleRoom = new DoubleRoom(55, 3);
        thirdDoubleRoom = new DoubleRoom(55,6);
    }

    @Test
    void testEquals() {
        assertEquals(doubleRoom, secondDoubleRoom);
        assertNotEquals(secondDoubleRoom, thirdDoubleRoom);
    }
}
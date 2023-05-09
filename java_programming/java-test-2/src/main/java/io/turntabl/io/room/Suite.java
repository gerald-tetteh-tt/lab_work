package io.turntabl.io.room;

public class Suite extends Room {
    private static final int CAPACITY = 3;
    private static final boolean BREAKFAST_INCLUDED = true;

    public Suite(int roomNumber, int floorNumber) {
        super(roomNumber, floorNumber, CAPACITY, BREAKFAST_INCLUDED);
    }
}

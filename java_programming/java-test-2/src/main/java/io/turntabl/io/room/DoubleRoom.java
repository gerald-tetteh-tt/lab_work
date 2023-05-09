package io.turntabl.io.room;

public class DoubleRoom extends Room {
    private static final int CAPACITY = 2;
    private static final boolean BREAKFAST_INCLUDED = false;

    public DoubleRoom(int roomNumber, int floorNumber) {
        super(roomNumber, floorNumber, CAPACITY, BREAKFAST_INCLUDED);
    }
}

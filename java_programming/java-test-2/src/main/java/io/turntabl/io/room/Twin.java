package io.turntabl.io.room;

public class Twin extends Room {
    private static final int CAPACITY = 2;
    private static final boolean BREAKFAST_INCLUDED = false;

    public Twin(int roomNumber, int floorNumber) {
        super(roomNumber, floorNumber, CAPACITY, BREAKFAST_INCLUDED);
    }
}

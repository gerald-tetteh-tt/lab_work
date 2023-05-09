package io.turntabl.io.room;

import java.util.Objects;

public abstract class Room {
    private final int roomNumber;
    private final int floorNumber;
    private final int capacity;
    private double ratePerNight;
    private int numberOfGuests;
    private final boolean breakfastIncluded;

    public Room(int roomNumber, int floorNumber, int capacity, boolean breakfastIncluded) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.capacity = capacity;
        this.breakfastIncluded = breakfastIncluded;
    }

    public void setRatePerNight(double ratePerNight) {
        this.ratePerNight = ratePerNight;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRatePerNight() {
        return ratePerNight;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber && floorNumber == room.floorNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, floorNumber);
    }
}

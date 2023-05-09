package io.turntabl.io.hotel;

import io.turntabl.io.exception.RoomAlreadyRegisteredException;
import io.turntabl.io.exception.RoomCapacityExceededException;
import io.turntabl.io.exception.RoomNotAvailableException;
import io.turntabl.io.room.Room;
import io.turntabl.io.service.RoomPricingService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class ENSHotelImpl implements ENSHotel {
    // holds the rooms as a key and the booked state as a value (boolean)
    private final Map<Room,Boolean> hotelRooms;
    private final RoomPricingService roomPricingService;

    public ENSHotelImpl(RoomPricingService roomPricingService) {
        this.hotelRooms = new HashMap<>();
        this.roomPricingService = roomPricingService;
    }

    @Override
    public void addRoom(Room room) throws RoomAlreadyRegisteredException {
        if(hotelRooms.containsKey(room)) {
            throw new RoomAlreadyRegisteredException("Room already exists");
        }
        hotelRooms.put(room,false);
    }

    @Override
    public void bookRoom(Room room, int numOfGuests, boolean includeBreakfast) {
        if(!hotelRooms.containsKey(room)) {
            throw new RoomNotAvailableException("This room is not available");
        }
        if(numOfGuests > room.getCapacity()) {
            throw new RoomCapacityExceededException("The number of guests is too large for this room");
        }
        double roomPrice = room.isBreakfastIncluded()
                ? roomPricingService.price(numOfGuests)
                : roomPricingService.price(numOfGuests,includeBreakfast);
        room.setRatePerNight(roomPrice);
        room.setNumberOfGuests(numOfGuests);
        hotelRooms.put(room,true);
    }

    @Override
    public int totalGuestsForToday() {
        Optional<Integer> numberOfGuests = hotelRooms
                .entrySet()
                .stream()
                .filter(Map.Entry::getValue)
                .map((entrySet) -> entrySet.getKey().getNumberOfGuests())
                .reduce(Integer::sum);
        return numberOfGuests.orElse(0);
    }

    @Override
    public double totalValueOfBookingsForToday() {
        Optional<Double> totalValueOfBookings = hotelRooms
                .keySet()
                .stream()
                .filter(room -> room.getNumberOfGuests() > 0)
                .map(Room::getRatePerNight)
                .reduce(Double::sum);
        return totalValueOfBookings.orElse(0.0);
    }

    public Map<Room, Boolean> getHotelRooms() {
        return hotelRooms;
    }
}

package io.turntabl.spaceship;

import io.turntabl.exception.FullyBookedException;
import io.turntabl.passenger.Passenger;
import io.turntabl.seat.HumanSeat;
import io.turntabl.seat.MartianSeat;
import io.turntabl.seat.Seat;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private final List<Seat> seats;
    private final Integer maxSeats;

    public Spaceship(Integer maxSeats) {
        seats = new ArrayList<>();
        this.maxSeats = maxSeats;
    }

    public void bookSeat(Passenger passenger) throws FullyBookedException {
        if(seats.size() >= maxSeats) {
            throw new FullyBookedException("The ship is fully booked");
        }
        Seat seat = switch (passenger.type()) {
            case HUMAN -> {
                HumanSeat humanSeat = new HumanSeat(passenger.id(), passenger.name());
                serveMeal(humanSeat);
                yield humanSeat;
            }
            case MARTIAN -> {
                MartianSeat martianSeat = new MartianSeat(passenger.id(), passenger.name());
                serveMeal(martianSeat);
                yield martianSeat;
            }
        };
        seats.add(seat);
    }

    private void serveMeal(HumanSeat humanSeat) {
        System.out.println("Fufu and light soup for " + humanSeat.getName());
    }
    private void serveMeal(MartianSeat martianSeat) {
        System.out.println("Human leg and cockroach soup for " + martianSeat.getName());
    }

    public List<Seat> getSeats() {
        return seats;
    }
}

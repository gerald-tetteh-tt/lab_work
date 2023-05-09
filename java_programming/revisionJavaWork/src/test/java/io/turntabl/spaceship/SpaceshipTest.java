package io.turntabl.spaceship;

import io.turntabl.exception.FullyBookedException;
import io.turntabl.passenger.Passenger;
import io.turntabl.passenger.PassengerType;
import io.turntabl.seat.HumanSeat;
import io.turntabl.seat.MartianSeat;
import io.turntabl.seat.Seat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpaceshipTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Spaceship underTest;
    private Passenger human;
    private Passenger martian;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        underTest = new Spaceship(2);
        human = new Passenger(1,"Gerald", PassengerType.HUMAN);
        martian = new Passenger( 2,"Martian Man Hunter", PassengerType.MARTIAN);
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testPassengerBooksAppropriateSeat() throws FullyBookedException {
        // book seats
        underTest.bookSeat(human);
        underTest.bookSeat(martian);
        // test if right seats allocated
        List<Seat> seats = underTest.getSeats();
        assertInstanceOf(HumanSeat.class,seats.get(0));
        assertInstanceOf(MartianSeat.class,seats.get(1));
    }

    @Test
    void testThrowExceptionOnBookingOverflow() {
        assertThrows(FullyBookedException.class, () -> {
            underTest.bookSeat(human);
            underTest.bookSeat(human);
            underTest.bookSeat(human);
        });
    }

    @Test
    void testHumanFoodAssignedOnBooking() throws FullyBookedException {
        // book seats
        underTest.bookSeat(human);
        // validate
        assertEquals("Fufu and light soup for " + human.name(),
                outputStreamCaptor.toString().trim());
    }

    @Test
    void testMartianFoodAssignedOnBooking() throws FullyBookedException {
        // book seats
        underTest.bookSeat(martian);
        // validate
        assertEquals("Human leg and cockroach soup for " + martian.name(),
                outputStreamCaptor.toString().trim());
    }
}
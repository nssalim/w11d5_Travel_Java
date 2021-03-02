import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Plane plane;
    Passenger passenger;
    Flight flight;

    @Before
    public void setup() {
        plane = new Plane(PlaneType.BEAMUSUPSCOTTY149);
        passenger = new Passenger("Paddington Bear", 1);
        Date date = new GregorianCalendar(2020, Calendar.OCTOBER, 27).getTime();
        flight = new Flight(plane, "CB123", AirportCode.NCL, AirportCode.YVR, date);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void bookingPassengerAddsFlightToPassenger() {
        flightManager.bookPassenger(passenger);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void canReduceRemainingSeats() {
        flightManager.bookPassenger(passenger);
        assertEquals(49, flight.getRemainingSeats());
    }

    @Test
    public void cannotBookPassengersBeyondCapacity() {
        flightManager.bookPassenger(passenger);
        flightManager.bookPassenger(passenger);
        flightManager.bookPassenger(passenger);
        assertEquals(3, flight.getNumberOfPassengers());
    }

    @Test
    public void canCalculateBaggageWeight() {
        flightManager.bookPassenger(passenger);
        assertEquals(5, flightManager.baggageWeight());
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        flightManager.bookPassenger(passenger);
        assertEquals(995, flightManager.remainingBaggageWeight());
    }

    @Test
    public void canCalculateBaggagePerPassenger() {
        assertEquals(20, flightManager.baggagePerPassenger());
    }
}
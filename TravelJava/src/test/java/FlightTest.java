import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightTest {
    Flight flight;
    Plane plane;
    Passenger passenger;
    Date date;

    @Before
    public void setup() {
        plane = new Plane(PlaneType.FREELIKEABIRD23);
        passenger = new Passenger("Superman", 1);
        date = new GregorianCalendar(2021, Calendar.MARCH, 5).getTime();
        flight = new Flight( plane,   "GO74", AirportCode.JFK, AirportCode.LAX, date);
    }

        @Test
        public void hasPlane(){
            assertEquals(plane, flight.getPlane());
        }

        @Test
        public void hasFlightNumber(){
            assertEquals("GO74", flight.getFlightNumber());
        }

        @Test
        public void hasDestination(){
            assertEquals(AirportCode.JFK, flight.getDestination());
        }

        @Test
        public void hasDepartureAirport(){
            assertEquals(AirportCode.LAX, flight.getDepartureAirport());
        }

        @Test
        public void startsEmpty(){
            assertEquals(0, flight.getNumberOfPassengers());
        }

        @Test
        public void canCheckRemainingSeats(){
            assertEquals(10, flight.getRemainingSeats());
        }

        @Test
        public void canBookPassenger(){
            flight.addPassengerToFlight(passenger);
            assertEquals(1, flight.getNumberOfPassengers());
        }

        @Test
        public void canGenerateSeatNumbers(){
            assertEquals(10, flight.getSeatNumbers().size());
        }

        @Test
        public void canAllocateSeatNumbers(){
            flight.allocateSeatNumber(passenger);
            assertNotNull(passenger.getSeatNumber());
            assertEquals(9, flight.getSeatNumbers().size());
        }
}

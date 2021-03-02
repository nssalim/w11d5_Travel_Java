import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup(){
        passenger = new Passenger("Paddington Bear", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Paddington Bear", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }

    @Test
    public void StartWithNoSeatNumber(){
        assertNull(passenger.getSeatNumber());
    }

    @Test
    public void canSetSeatNumber(){
       Integer seatNumber = 150;
        passenger.setSeatNumber(seatNumber);
        assertEquals(seatNumber, passenger.getSeatNumber());

    }
}

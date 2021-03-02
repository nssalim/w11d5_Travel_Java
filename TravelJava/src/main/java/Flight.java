import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Flight {
    private final Plane plane;
    private final String flightNumber;
    private final AirportCode destination;
    private final AirportCode departureAirport;
    private final Date departureTime;
    private final ArrayList<Passenger> passengers;
    private final ArrayList<Integer> seatNumbers;

    public Flight(Plane plane, String flightNumber, AirportCode destination, AirportCode departureAirport, Date departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
        this.seatNumbers = generateSeatNumbers();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public AirportCode getDestination() {
        return destination;
    }

    public AirportCode getDepartureAirport() {
        return departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    private ArrayList<Integer>generateSeatNumbers(){
        ArrayList<Integer>seatNumbers = new ArrayList<>();
        for(int i = 1; i<= this.plane.getCapacity(); i ++){
            seatNumbers.add(i);
        }
        return seatNumbers;
    }

    public ArrayList<Passenger> getPassengerList(){
        return this.passengers;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    //Return the number of available seats
    public int getRemainingSeats(){
        return this.plane.getCapacity() - getNumberOfPassengers();
    }

    //Book a passenger (if there are remaining seats)
    public void addPassengerToFlight(Passenger passenger){
        this.passengers.add(passenger);
        allocateSeatNumber(passenger);
    }

    public void allocateSeatNumber(Passenger passenger){
        Random random = new Random();
        int randomIndex = random.nextInt (this.seatNumbers.size());
        Integer seatNumber= this.seatNumbers.remove(randomIndex);
        passenger.setSeatNumber(seatNumber);
    }

    public ArrayList<Integer>getSeatNumbers(){
        return seatNumbers;
    }

}

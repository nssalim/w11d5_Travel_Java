public class FlightManager {
    private final Flight flight;
    private final int reservedBaggageWeight;
    //Passengers exist for only a single flight
    //Each passenger bag weighs the same
    //Planes reserve half of their total weight for passenger bags.
    //Calculate how much baggage weight should be reserved for each passenger for a flight
    public FlightManager(Flight flight) {
        this.flight = flight;
        this.reservedBaggageWeight=flight.getPlane().getWeight()/2;
    }
    public void bookPassenger(Passenger passenger){
        if(this.flight.getRemainingSeats() >0){
            this.flight.addPassengerToFlight(passenger);
            passenger.setFlight(this.flight);
        }
    }
    //Calculate how much baggage weight is booked by passengers of a flight
    public int baggageWeight(){
        int totalBaggageWeight = 0;
        for (Passenger passenger : this.flight.getPassengerList()){
            int baggageWeight = passenger.getNumberOfBags() * 5;
            totalBaggageWeight += baggageWeight;
        }
        return totalBaggageWeight;
    }
    //Calculate how much overall weight reserved for baggage remains for a flight.
    public int remainingBaggageWeight(){
        return reservedBaggageWeight - baggageWeight();
    }
    //The weight of bag per person is the weight reserved for passenger bags divided by the capacity.
    public int baggagePerPassenger(){
        int passengers = this.flight.getPlane().getCapacity();
        return reservedBaggageWeight/passengers;
    }
}

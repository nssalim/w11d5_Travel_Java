public class Passenger {
    private final String name;
    private final int bags;
    private Flight flight;
    private Integer seatNumber;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = null;
        this.seatNumber = null;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return bags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }
}

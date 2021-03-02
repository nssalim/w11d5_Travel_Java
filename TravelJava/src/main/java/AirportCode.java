public enum AirportCode {
    LHR("London Heathrow Airport"),
    CDG("Paris Charles de Gaulle Airport"),
    YVR("Vancouver International Airport"),
    TUN("Tunis-Carthage Airport"),
    NCL("Newcastle Airport"),
    CAI("Cairo International Airport"),
    LAX("Los Angeles International Airport"),
    JFK("New York JFK Airport");

    public final String airportName;

    AirportCode(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportName(){
        return this.airportName;
    }
}

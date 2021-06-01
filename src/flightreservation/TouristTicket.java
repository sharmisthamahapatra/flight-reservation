package flightreservation;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String hotelAddress,
                         String[] selectedTouristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

public String getHotelAddress() {
    return hotelAddress;
}

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
}

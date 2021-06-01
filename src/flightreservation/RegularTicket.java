package flightreservation;

public class RegularTicket extends Ticket{
    private String specialServices;
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}

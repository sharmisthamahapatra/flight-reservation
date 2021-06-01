package flightreservation;


public class main {

    public static void main(String[] args) {

            Ticket regularTicket = new RegularTicket("12345678", "Bhubaneswar",
                    "Puri", "10 pm", "9 pm",
                    "100", 1000, false, null, null, "Nothing");

            Ticket touristTicket = new TouristTicket("987654321", "Puri", "Bhubaneswar",
                    "11 PM", "10 PM",
                    "13625", 10000, false, null, null,
                    "Donot know", new String[]{""});

            printTicketDetails(regularTicket);
            printTicketDetails(touristTicket);
        }

        public static void printTicketDetails(Ticket ticket)
        {
            System.out.println(ticket.getPnr());
        }

}

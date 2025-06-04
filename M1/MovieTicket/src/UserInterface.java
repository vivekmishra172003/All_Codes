import java.util.Scanner;



public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        
        System.out.println("Enter no of bookings");
        int noOfBookings = scanner.nextInt();
        
        System.out.println("Enter the available tickets");
        int available = scanner.nextInt();
        Ticket.setAvailableTickets(available);
        
        for (int i = 0; i < noOfBookings; i++) {
            System.out.println("Enter the ticketid");
            int id = scanner.nextInt();
            System.out.println("Enter the price");
            int priceVal = scanner.nextInt();
            System.out.println("Enter the no of tickets");
            int noOfTickets = scanner.nextInt();
            
            Ticket ticket = new Ticket();
            ticket.setTicketid(id);
            ticket.setPrice(priceVal);
            
            System.out.println("Available tickets: " + Ticket.getAvailableTickets());
            
            int totalAmount = ticket.calculateTicketCost(noOfTickets);
            if (totalAmount == -1) {
                System.out.println("Tickets are not available");
            } else {
                System.out.println("Total amount: " + totalAmount);
                if (Ticket.getAvailableTickets() == 0) {
                    System.out.println("House full");
                } else {
                    System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
                }
            }
        }
        scanner.close();
    }
}
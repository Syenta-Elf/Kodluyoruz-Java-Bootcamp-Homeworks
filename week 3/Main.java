public class Main {
    public static void main(String[] args) {
        
        THY thy = THY.createTHY();
        Pegasus p = Pegasus.createpegasus();

        Ticket t1 = new Ticket(thy);
        Ticket t2 = new Ticket(p);
        t1.buyTicket(20, false, true);
        System.out.println("Tutar:"+t1.getTotalFare());
        
       
        
    }
}

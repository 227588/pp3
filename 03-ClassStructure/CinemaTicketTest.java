public class CinemaTicketTest {
    public static void main(String[] arg){
        CinemaTicket c1 = new CinemaTicket();
        c1.title = "T1";
        c1.seat = 3;
        c1.row = 6;
        c1.price = 12.50;
        System.out.println(c1);

        System.out.print("------------------\n");

        CinemaTicket c2 = new CinemaTicket();
        c2.title = "T2";
        c2.seat = 23;
        c2.row = 46;
        c2.price = 32.50;
        System.out.println(c2);
    }
}

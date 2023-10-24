public class CinemaTicket {
    static String cinemaName = "Helios";
    String title;
    int row;
    int seat;
    double price;

    public String toString(){
        return ("Cinema name: " + CinemaTicket.cinemaName + "\nTitle: " + title + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: " + price);
    }

}

public class CinemaTicket2 {
    static String cinemaName = "Helios";
    String title;
    int row;
    int seat;
    double price;

    public CinemaTicket2(String title, int row, int seat){
        this.title=title;
        this.row=row;
        this.seat=seat;
        this.price=(this.row<3)?10:25;
    }

    public String toString(){
        return ("Cinema name: " + CinemaTicket.cinemaName + "\nTitle: " + title + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: " + price);
    }

}

public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    /*
     * Returns date
     * in the form yyyy-mm-dd
     */
    static String myDate(){
        return year+"-"+String.format("%02d",month)+"-"+String.format("%02d",day);
    }

    /*
     * Returns the number of days
     * from the beginning of year
     */

    static int days(){
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int numberOfDays = 0;
        for(int i=0; i<month; i++){
            numberOfDays += months[i];
        }
        numberOfDays += day;
        return numberOfDays;
    }

    /*
     * Returns month name
     */

    static String monthName(){
        String[] months = {"styczeń", "luty", "marzec", "kwiecień", "maj", "czerwiec", "lipiec", "sierpień", "wrzesień", "październik", "listopad", "grudzień"};
        return months[month-1];
    }
}

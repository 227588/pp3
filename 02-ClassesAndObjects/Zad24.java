public class Zad24 {
    public static void main(String arg[]){
        int hours = 14;
        int minutes = 27;
        int minutesFromMidnight = minutes + hours*60;
        int secondsFromMidnight = minutesFromMidnight*60;
        System.out.printf("hours = %s", hours);
        System.out.printf("\nminutes = %s", minutes);
        System.out.printf("\ntime: %s:%s", hours, minutes);
        System.out.printf("\nminutes from midnight: %s", minutesFromMidnight);
        System.out.printf("\nseconds from midnight: %s\n", secondsFromMidnight);
    }
}

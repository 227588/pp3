public class ClockTest {
    public static void main(String[] args) {
        Clock c = new Clock(4,57);
        System.out.println(c);
        c.addMinute();
        c.addMinute();
        c.addMinute();
        c.addHour();
        System.out.println(c);
    }
}

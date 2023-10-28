public class ClockTest{
    public static void main(String[] args) {
        Clock c1 = new Clock(12, 47);
        c1.displayTime();
        c1.setClock(18, 14);
        c1.displayTime();
        c1.setClock(9, 3);
        c1.displayTime();
        c1.setClock(23, 58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        
        //alarm set
        c1.setAlarm(0, 2);
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        
    }
}
public class LampTest {
    public static void main(String arg[]){
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();

        l1.turnOff();
        l2.turnOn();
    
        l1.showInfo();
        l2.showInfo();
    }
}

public class Lamp {
    boolean turnOn;

    public void turnOn(){
        turnOn = true;
    }
    public void turnOff(){
        turnOn = false;
    }
    public void showInfo(){
        String state = (turnOn) ? "The lamp is on" : "The lamp is off";
        System.out.println(state);
    }
}

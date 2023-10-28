public class InternetDeviceTest {
    public static void main(String[] args) {
        InternetDevice id1 = new InternetDevice("Samsung");
        InternetDevice id2 = new InternetDevice("Xiaomi");
        InternetDevice id3 = new InternetDevice("Iphone");
        InternetDevice id4 = new InternetDevice("Lg");
        InternetDevice id5 = new InternetDevice("Sony");

        id1.connect();
        id2.connect();
        id3.connect();
        id4.disConnect();
        id5.disConnect();


        id1.displayStatus();
        id2.displayStatus();
        id3.displayStatus();
        id4.displayStatus();
        id5.displayStatus();

        InternetDevice.DisplayConnections();
    }
}

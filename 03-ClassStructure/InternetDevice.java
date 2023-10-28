public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices;

    public InternetDevice(String name){
        this.name = name;
    }

    public void connect(){
        if(connected!=true)
            connectedDevices++;
        connected=true;
    }
    public void disConnect(){
        if(connected!=false)
            connectedDevices--;
        connected=false;
    }
    public boolean isConnected(){
        return connected;
    }
    public void displayStatus(){
        String status = (connected)?"Connected":"Disconnected";
        System.out.println("Name: "+name+"\nStatus: "+status);
    }
    public static void DisplayConnections(){
        System.out.println("Connections: "+connectedDevices);
    }
}

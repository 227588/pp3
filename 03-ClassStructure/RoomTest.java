public class RoomTest {
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        int index = 0;

        rooms[index++] = new Room(1);
        rooms[index-1].checking("Zbyszek");
        rooms[index++] = new Room(2);
        rooms[index-1].checking("Władek");
        rooms[index++] = new Room(3,3);
        rooms[index++] = new Room(4,3);
        rooms[index++] = new Room(5,3);
        rooms[index++] = new Room(6,1);

        System.out.println("\na)--------------------");
        System.out.println(rooms[0].toString());
        System.out.println("\nb)--------------------");
        Room.reportB(rooms);
        System.out.println("\nc)--------------------");
        Room.reportC(rooms,3);
        System.out.println("\nd)--------------------");
        Room.reportD(rooms);
        System.out.println("\ne)--------------------");
        Room.reportE(rooms);
    
        // System.out.println(rooms[0].toString());
    }
}

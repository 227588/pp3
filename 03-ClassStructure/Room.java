public class Room {
    int number;
    int beds;
    boolean occupied = false;
    String guestName;

    public Room(int number){
        this.number = number;
        beds = 2;
    }

    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }

    public void checking(String guestName){
        this.guestName = guestName;
        occupied=true;
    }

    public void checkout(){
        guestName = null;
        occupied=false;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public String toString(){
        String occupiedStatus = (occupied)?"Occupied":"Not occupied";
        return String.format("Room number: %S. Number of beds: %s. Occupied: %s. Guest name: %s", number, beds, occupiedStatus, guestName);
    }

    public static void reportB(Room[] rooms){
        for(Room oneRoom : rooms){
            System.out.println(oneRoom.toString());
        }
    }

    public static void reportC(Room[] rooms, int bedsNumber){
        for(Room oneRoom : rooms){
            if(oneRoom.beds==bedsNumber)
                System.out.println(oneRoom.toString());
        }
    }

    public static void reportD(Room[] rooms){
        int occupiedCounter = 0;
        for(Room oneRoom : rooms){
            if(oneRoom.occupied==true)
                occupiedCounter++;
        }
        System.out.printf("Vacant: %s \nOccupied: %s\n",rooms.length-occupiedCounter, occupiedCounter);
    }

    public static void reportE(Room[] rooms){
        int vacantBeds = 0;
        for(Room oneRoom : rooms){
            if(oneRoom.occupied==false)
                vacantBeds+=oneRoom.beds;
        }
        System.out.printf("\nNumber of vacant beds: %s\n", vacantBeds);
    }
}

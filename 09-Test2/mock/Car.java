public class Car extends Vehicle{
    private int maxSpeed;
    
    public Car(int maxSpeed, int seats) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] array = {getSeats(), maxSpeed};
        return array;
    }

    public static void main(String[] args) {
        Car c1 = new Car(200, 5);
        System.out.print(c1.spec()[0]+" "+c1.spec()[1]);
    }
}

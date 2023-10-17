public class Zad21 {    
    public static void main(String[] args) {
        int height = 188;
        double feet = (int) height*3.28084/100.0;
        int inches = (int)((feet - (int)feet)*12);
        System.out.println("I am "+height+"tall, i.e. "+(int)feet+" feet and "+inches+" inches");
    }
}
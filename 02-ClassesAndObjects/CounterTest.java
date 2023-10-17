public class CounterTest {
    public static void main(String arg[]){
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increaseByTen();
        c1.increaseByTen();
        c1.increaseByOne();
        c1.increaseByOne();
        c1.increaseByOne();

        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.increaseByOne();
        c2.increaseByOne();
        c2.increaseByOne();

        System.out.println("Counter 1: "+c1.value);
        System.out.println("Counter 2: "+c2.value);
    }
}

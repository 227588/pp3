public class Counter {
    private int value;
    public Counter(){
        value=0;
    }
    public void increase(){
        value++;
    }
    public void increase(int n){
        value+=n;
    }
    public void decrease(){
        value--;
    }
    public void decrease(int n){
        value-=n;
    }
    public int value(){
        return value;
    }
}

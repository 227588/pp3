public class Counter {
    int value = 0;
    public void increaseByOne(){
        value+=1;
    }
    public void increaseByTen(){
        value+=10;
    }
    public void decreaseByOne(){
        value-=1;
    }
    public void decreaseByTen(){
        value-=10;
    }
    public void reset(){
        value=0;
    }
}

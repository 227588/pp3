public class SuperCounter extends Counter {
    public SuperCounter(int c) {
        super(c);
    }
    public void addN(int n){
        for (int i = 0; i < n; i++) {
            add1();
        }
    }

    public static void main(String[] args) {
        SuperCounter sc = new SuperCounter(4);
        sc.addN(2);
        System.out.print(sc.getCounter()+"\n");
    }
}

public class AudiobookTest {
    public static void main(String[] args) {
        Book b1 = new Book("1","2","1","2");
        b1.display();
        Book b2 = new Book("3","4","1","2");
        b2.display();
        Audiobook ab1 = new Audiobook("t1", "a1","1","2",24,10);
        ab1.display();
    }
}

public class EbookTest {
    public static void main(String[] args) {
        Book b1 = new Book("1","2","1","2");
        b1.display();
        Book b2 = new Book("3","4","1","2");
        b2.display();
        Ebook Eb1 = new Ebook("title1", "author1","1","2", "ebook1.txt");
        Eb1.display();
    }
}

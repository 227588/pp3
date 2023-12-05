import java.util.ArrayList;

public class Library{
    ArrayList<Book> list = new ArrayList<Book>();
    // private Book[] list; 

    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("title1", "author1","1","2");
        Ebook eb1 = new Ebook("title1", "author1","1","2","ebook.txt");
        Audiobook ab1 = new Audiobook("title1", "author1","1","2", 24,1);

        lib.list.add(b1);
        lib.list.add(eb1);
        lib.list.add(ab1);

        for (Book i : lib.list) {
            i.display();
        }
    }
}

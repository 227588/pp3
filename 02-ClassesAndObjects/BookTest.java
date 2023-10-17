public class BookTest {
    public static void main(String arg[]){
        Book b1 = new Book();
        b1.title = "Ksiazka";
        b1.author = "Człowiek";
        b1.currentPage = 0;
        b1.price = 25.49;
        b1.pages = 200;

        Book b2 = new Book();
        b2.title = "Ksiazka_2";
        b2.author = "Człowiek_2";
        b2.currentPage = 4;
        b2.price = 55.49;
        b2.pages = 100;

        b1.showInfo();
        b1.readBook();

        b2.showInfo();
        b2.readBook();
    }
}

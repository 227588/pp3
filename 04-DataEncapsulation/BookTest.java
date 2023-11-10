public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Słownik");
        b.setPages(250);
        b.setPages(-250);
        System.out.println(b.getPages());
    }
}

public class Book {
    double price;
    String title;
    int pages;
    int currentPage;
    String author;

    public void showInfo(){
        System.out.printf("Price: %s\nTitle: %s\nPages: %s\nCurrent page: %s\nAuthor: %s",price,title,pages,currentPage,author);
    }
    public void readBook(){
        System.out.println("You are reading page "+currentPage);
    }
}

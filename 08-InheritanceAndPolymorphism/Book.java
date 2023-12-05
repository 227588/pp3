public class Book {
    private String title;
    private String author;
    private String name;
    private String city;
    
    public Book(String title, String author, String name, String city) {
        this.title = title;
        this.author = author;
        this.name = name;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public void display() {
        System.out.print("Book [title=" + title + ", author=" + author + ",publisher name="+name+", city="+city+"]\n\n");
    }

    

    public static void main(String[] args) {
        Book b = new Book("1","2","3","4");
        b.display();
    }
}

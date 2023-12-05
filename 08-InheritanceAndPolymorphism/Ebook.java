public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName, String name, String city) {
        super(title, author, name, city);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.print("Ebook [title="+getTitle()+", author="+getAuthor()+",publisher name="+getName()+", city="+getCity()+", file name=" +fileName+"]\n\n");
    }
    
    
}

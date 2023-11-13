public class C6{
    private String title;
    private int pages;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int n) {
        if(n>0)
            this.pages = n;
    }
    
}
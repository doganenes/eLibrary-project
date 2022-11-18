public class Book {

    private Page[] pages;
    private String name;
    private int year;
    private String author;
    private String publisher;
    private int pageCount;

    public Book() {
    }

    public Book(String name, int year, String author, String publisher, int pageCount) {
        this.pages = new Page[pageCount];
        this.name = name;
        this.year = year;
        this.author = author;
        this.publisher = publisher;
    }

    public Page[] getPage() {
        return pages;
    }

    public void setPage(Page[] page) {
        this.pages = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void addPage(Page p1) {
        this.pages[p1.getPageCount() - 1] = p1;
    }

    public String getPageContent(int pageNum) {
        return pages[pageNum - 1].getPageContent();
    }
}

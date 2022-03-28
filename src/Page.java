public class Page {
    // her bir sayfaya ait sayfa sayısı ve içeriği

    private String pageContent;
    private int pageCount;

    // empty constructor
    public Page() {
    }

    public Page(int pageCount, String pageContent) {
        this.pageCount = pageCount;
        this.pageContent = pageContent;
    }

    // Getter - setter
    public String getPageContent() {
        return pageCount + "- " + pageContent;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setPageContent(String content) {

        this.pageContent = content;
    }

}

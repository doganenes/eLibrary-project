public class Page {

    private String pageContent;
    private int pageCount;

    public Page() {
    }

    public Page(int pageCount, String pageContent) {
        this.pageCount = pageCount;
        this.pageContent = pageContent;
    }

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

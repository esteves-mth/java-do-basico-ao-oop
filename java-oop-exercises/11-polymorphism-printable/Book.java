public class Book implements Printable{
    private String title;
    private String author;
    private int pages;
    private int released;

    public Book(String title, String author, int pages, int released) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.released = released;
    }

    @Override
    public void print() {
        System.out.println(getTitle());
        System.out.println(getAuthor());
    }

    @Override
    public String getContent() {
        return "O livro " + getTitle() + ", escrito por " + getAuthor() + ", contém " + getPages() +
                " páginas e foi lançado em " + getReleased();
    }

    @Override
    public String getDocumentType() {
        return "Livro";
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }
}

public class Report implements Printable{
    private String title;
    private String author;
    private String date;

    public Report(String title, String author, String date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println("Relatório");
        System.out.println(getAuthor());
        System.out.println(getDate());
        System.out.println(getTitle());
    }

    @Override
    public String getContent() {
        return "O relatório escrito por " + getAuthor() + ", entregue em " + getDate() + " tem como assunto " + getTitle();
    }

    @Override
    public String getDocumentType() {
        return "Relatório";
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

public class Bookl {
    private String titulo;
    private String author;
    private String categoria;
    private int totPag;

    public Bookl(String titulo, String author, String categoria, int totPag) {
        this.titulo = titulo;
        this.author = author;
        this.categoria = categoria;
        setTotPag(totPag);
    }

    public String getTitulo() {
        return titulo;
    } public String getAuthor() {
        return author;
    } public String getCategoria() {
        return categoria;
    } public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        if (totPag > 0){
            this.totPag = totPag;
        } else {
            throw new IllegalArgumentException("Item inválido");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", author='" + author + '\'' +
                ", categoria='" + categoria + '\'' +
                ", totPag=" + totPag + '}';
    }
}

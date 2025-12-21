public class Loan {
    private User usuario;
    private Bookl livro;
    private boolean ativo;

    public Loan(User usuario, Bookl livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.ativo = true;
    }

    public User getUsuario() {
        return usuario;
    }
    public Bookl getLivro() {
        return livro;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void devolver(){
        this.ativo = false;
    }
}

package Livro;

public class BibliotecaMain{
    public static void main(String[] args) {
            Livro l1 = new Livro();
            l1.setIdLivro(2001);
            l1.setTitulo("Capitão América: O Primeiro Vingador");
            l1.cadastrarLivro( "Ed Brubaker", "Héroi", 2007);
            Livro l2 = new Livro();
            l2.setTitulo("Homem de Ferro: Extremis");
            l2.setIdLivro(2002);
            l2.cadastrarLivro( "Warren Ellis", "Héroi", 2005);
            l2.emprestarLivro();
            l1.emprestarLivro();
            l1.devolverLivro();
            l2.devolverLivro();
            l1.emprestarLivro();
            l2.informacoesLivro();
            l1.informacoesLivro();
            l2.devolverLivro();
            l1.emprestarLivro();
        }
}

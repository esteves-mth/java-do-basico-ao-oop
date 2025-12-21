import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Bookl> livros = new ArrayList<>();

    public void addBook(Bookl livro){
        livros.add(livro);
    }
    public void removeBook(Bookl livro){
        livros.remove(livro);
    }
    public void listBooks(){
        for (Bookl g: livros){
            System.out.printf("%d. %s - %s\n", livros.indexOf(g) + 1, g.getTitulo(), g.getAuthor());
        }
    }
    public void findByTitle(String titulo){
        int contador = 0;
        System.out.printf("Livros com o nome '%s': \n",titulo);
        for (Bookl g: livros){
            if (g.getTitulo().equalsIgnoreCase(titulo)){
                System.out.printf("%s. %s - %s\n", g.getID(), g.getTitulo(), g.getAuthor());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("Não encontrado.");
        }
    }
    public void findByCategory(String categoria){
        int contador = 0;
        System.out.println(categoria + ": ");
        for (Bookl g: livros){
            if (g.getCategoria().equalsIgnoreCase(categoria)){
                System.out.printf("%s. %s - %s\n", g.getID(), g.getTitulo(), g.getAuthor());
                contador ++;
            }
        }
        if (contador == 0){
            System.out.println("Não encontrado.");
        }

    }
}

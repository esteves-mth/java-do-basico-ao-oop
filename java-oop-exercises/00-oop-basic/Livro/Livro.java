package Livro;

import java.util.Scanner;

public class Livro {
    public int idLivro;
    protected String titulo;
    private String autor;
    private String categoria;
    private boolean disponivel;
    private int anoPublicacao;

    public Livro(){
        disponivel = true;
    }
    public void informacoesLivro(){
        System.out.println("--------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Categoria: " + categoria);
        System.out.println("Livro " + (disponivel? "disponível": "indisponível"));
        System.out.println("--------------------------\n");
    }

    public int getIdLivro(){
        return this.idLivro;
    } public void setIdLivro(int id){
        this.idLivro = id;
        System.out.printf("ID '%d' implementado\n", this.idLivro);
    }
    public String getTitulo(){
        return this.titulo;
    } public void setTitulo(String titulo){
        this.titulo = titulo;
        System.out.printf("Titulo '%s' implementado\n", this.titulo);
    }
    public String getAutor(){
        return this.autor;
    } public void setAutor(String autor){
        this.autor = autor;
        System.out.printf("Autor '%s' implementado\n", this.autor);
    }
    public String getCategoria(){
        return this.categoria;
    } public void setCategoria(String categoria){
        this.categoria = categoria;
        System.out.printf("Categoria '%s' implementado\n", this.categoria);
    }
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    } public void setAnoPublicacao(int ano){
        this.anoPublicacao = ano;
        System.out.printf("Ano de publicação '%d' implementado\n", this.anoPublicacao);
    }

    public void cadastrarLivro(String autor, String categoria, int ano){
        this.autor = autor;
        this.categoria = categoria;
        this.anoPublicacao = ano;
        this.disponivel = true;
    }

    public void emprestarLivro(){
        System.out.println("Emprestando livro...");
        if (this.disponivel == true){
            disponivel = false;
            System.out.printf("Emprestimo do livro '%s' sucedido com sucesso.\n", this.titulo);
        }
        else {
            System.out.printf("ERRO!! Livro '%s' indisponível\n", this.titulo);
        }
    }

    public void devolverLivro(){
        System.out.println("Devolvendo livro...");
        if (this.disponivel == false){
            disponivel = true;
            System.out.printf("Devolução do livro '%s' sucedido com sucesso.\n", this.titulo);
        }
        else {
            System.out.printf("ERRO!! Livro '%s' já está disponível\n", this.titulo);
        }
    }

}

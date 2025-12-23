
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("Idade: ");
        int idade = ler.nextInt();
        System.out.print("Nota: ");
        float nota = ler.nextFloat();

        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Nota: " + nota);

    }
}

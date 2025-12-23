import java.util.Scanner;

public class ManipulaString{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("-------------------------------------------\n");
        System.out.println("         Manipulador de String     ");
        System.out.print("-------------------------------------------\n");
        System.out.print("Escreva seu texto: ");
        String texto = ler.nextLine();
        System.out.print("-------------------------------------------\n");
        System.out.println("Seu texto em versão UpperCase (Caixa Alta): " + texto.toUpperCase());
        System.out.println("\nSeu texto tem no total " + texto.length() + " caracteres.");
        System.out.print("-------------------------------------------\n");
    }
}

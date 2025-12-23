import java.util.Scanner;

public class TabelaMultiplicacao {

    public static void main(String[] args) {
        Scanner leria = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("  Tabela de Multiplicação");
        System.out.println("----------------------------");
        System.out.print("Digite um numero: ");
        int numeroprincipal = leria.nextInt();
        System.out.println("----------------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.print(numeroprincipal + " x " + i + " = " + numeroprincipal*i + "\n");
        }
        System.out.println("----------------------------\n");
    }
    
}

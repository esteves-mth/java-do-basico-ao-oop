import java.util.Scanner;

public class VerificadorIdade{

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("----------------------------");
            System.out.println("   Verificador de Idade");
            System.out.println("----------------------------\n");
            System.out.print("Digite sua idade: ");
            int idade = ler.nextInt();
            if (idade < 18){
                System.out.println("\n----------------------------");
                System.out.println("Você é menor de idade.");
                System.out.println("----------------------------\n");
            }
            else if (idade < 60){
                System.out.println("\n----------------------------");
                System.out.println("Você é adulto.");
                System.out.println("----------------------------\n");
            }
            else {
                System.out.println("\n----------------------------");
                System.out.println("Você é idoso.");
                System.out.println("----------------------------\n");
            }
    }
}

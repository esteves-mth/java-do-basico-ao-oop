import java.util.Scanner;

public class CadastroNotas {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double soma = 0.0;

        System.out.print("-------------------------------------------\n");
        System.out.println("              Cadastro Notas     ");
        System.out.print("-------------------------------------------\n");
        System.out.print("Escreva quantas notas deseja cadastrar: ");
        int quantNotas = ler.nextInt();
        double[] notas = new double[quantNotas];
        System.out.print("-------------------------------------------\n");
        System.out.println("       Cadastre a seguir suas notas     ");
        System.out.print("-------------------------------------------\n");

        for (int i = 0; i < quantNotas; i++) {
        notas[i] = ler.nextDouble();
        soma = soma + notas[i];
        }
        System.out.print("-------------------------------------------\n");
        double media = soma/quantNotas;
        System.out.printf("A media das suas notas são %.2f", media);
        System.out.print("\n-------------------------------------------\n");
    }
}

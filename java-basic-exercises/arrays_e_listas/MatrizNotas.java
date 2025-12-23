import java.util.Scanner;

public class MatrizNotas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double [][] notas = new double[3][4];
        double [] soma = {0, 0, 0};
        double [] media = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("ESCREVA A " + (j+1)  + "° NOTA DO ALUNO " + (i + 1) + ": ");
                notas[i][j] = ler.nextDouble();
                soma [i] = soma[i] + notas[i][j];
            }
            media [i] = soma[i]/4;
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("Aluno %d -> ", (i+1));
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5.1f", notas[i][j]);
            }
            System.out.printf("  // media: %3.1f", media[i]);
            System.out.println();
        }
    }
}

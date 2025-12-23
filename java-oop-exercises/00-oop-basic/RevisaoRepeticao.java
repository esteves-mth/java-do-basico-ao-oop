import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numbers [] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Escreva o " + (i+1 + "º número: "));
            numbers [i] = ler.nextInt();
        }
        int soma = 0;
        int p = 0;
        int i = 0;
        for (int e = 0; e < 5; e++){
            soma += numbers[e];
            if (numbers[e] % 2 == 0){
                p++;
            }
            else{
                i++;
            }
        }
        double media = soma/5.0;

        System.out.println("A soma de todos os números: " + soma);
        System.out.println("A média dos números: " + media);
        System.out.println("No total são " + p + " números pares e " + i + " números impares." );

        //Feito por Esteveszin
    }
}

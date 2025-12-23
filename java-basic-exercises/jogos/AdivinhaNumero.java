import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero{

    public static void main(String[] args) {
        Random gerar = new Random();
        Scanner leu = new Scanner(System.in);
        int ns = gerar.nextInt(1, 21);
        System.out.println("--------------------------------------------------");
        System.out.println("                   Advinha Números");
        System.out.println("--------------------------------------------------");
        System.out.println("   O programa gera um número aleatório de 1 a 20");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite um numero: ");
        int seunumero = leu.nextInt();
        while (seunumero != ns) {
            if (seunumero < ns) {
                System.out.println("O numero é maior");
            }
            else if (seunumero < 1 || seunumero > 20){
                System.out.println("Você tem que digitar um numero de 1 a 20");
            }
            else{
                System.out.println("O numero é menor"); 
            }
        System.out.print("Digite um numero: ");
        seunumero = leu.nextInt();

        }
        System.out.println("--------------------------------------------------");
        System.out.println("Parabéns!!" +  " Você acertou o numero, que era " + ns);
        System.out.println("--------------------------------------------------\n");


    }
}

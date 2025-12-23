import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoPontos {
    public static void main(String[] args) {
        Random gerar = new Random();
        Scanner ler = new Scanner(System.in);
        int chances = 10;
        int tentativas = 1;
        int pont = 100;
        int ns = gerar.nextInt(1, 101);
        System.out.println("---------------------------------------------");
        System.out.println("             ADIVINHAÇÃO DE NÚMEROS");
        System.out.println("---------------------------------------------");
        System.out.println("O programa gera um número aleatório de 1 a 100.");
        System.out.println("Você começa com 100 pontos e perde 10 pontos por tentativa errada.");
        System.out.println("Se acertar em menos de 5 tentativas, ganha 50 pontos bônus.");
        System.out.println("---------------------------------------------");
        System.out.print("Escreva um número: ");
        int n = ler.nextInt();

        while (n != ns && chances > 0) {
            if (n > ns) {
                System.out.println("Dica: tente um número menor.");
            } else {
                System.out.println("Dica: tente um número maior.");
            }
            pont -= 10;
            chances--;
            tentativas++;

            System.out.println("Tentativas restantes: " + chances);
            System.out.println("Pontuação atual: " + pont);
            System.out.print("Tente novamente: ");
            n = ler.nextInt();
        }

        if (n == ns) {
            System.out.println("\nParabéns! Você acertou o número.");
            if (tentativas < 5) {
                pont += 50;
                System.out.println("Bônus de 50 pontos por acertar rápido.");
            }
            System.out.println("Sua pontuação final: " + pont + " pontos.");
            System.out.println("Número de tentativas: " + tentativas);
        }
        else {
            System.out.println("\nVocê perdeu. O número era: " + ns);
        }

        System.out.println("\nFim do jogo. Obrigado por jogar!");
    }
}

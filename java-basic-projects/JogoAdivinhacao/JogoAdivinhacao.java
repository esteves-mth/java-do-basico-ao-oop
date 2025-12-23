import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random gerar = new Random();
        Scanner ler = new Scanner(System.in);
        int v = 0;
        int de = 0;
        int recorde = 0;
        int chances = 10;
        int tentativas = 1;
        int pont = 100;
        while (true){
        int ns = gerar.nextInt(1, 101);
        System.out.println("---------------------------------------------");
        System.out.println("             ADIVINHAÇÃO DE NÚMEROS");
        System.out.println("---------------------------------------------");
        System.out.println("O programa gera um número aleatório de 1 a 100.");
        System.out.println("================DIFICULDADES================");
        System.out.println("1 - Fácil (15 tentativas)");
        System.out.println("2 - Médio (10 tentativas)");
        System.out.println("3 - Difícil(5 tentativas)");
        System.out.println("4 - Personalizada (você escolhe)");
        System.out.println("Escolha a dificuldade: ");
        int d = ler.nextInt();
        while (d != 1 && d != 2 && d != 3 && d != 4) {
            System.out.println("ERRO!! Escreva a Dificuldade.");
            System.out.println("================DIFICULDADES================");
            System.out.println("1 - Fácil (15 tentativas)");
            System.out.println("2 - Médio (10 tentativas)");
            System.out.println("3 - Difícil(5 tentativas)");
            System.out.println("4 - Personalizada (você escolhe)");
            System.out.println("Escolha a dificuldade: ");
            d = ler.nextInt();
        }
        switch (d) {
            case 1:
                chances = 15;
                tentativas = 1;
                pont = 150;
                break;
            case 2:
                chances = 10;
                tentativas = 1;
                pont = 100;
                break;
            case 3:
                chances = 5;
                tentativas = 1;
                pont = 50;
                break;
            case 4:
                System.out.println("\n--- MODO PERSONALIZADO ---");
                System.out.print("Tentativas (1-50): ");
                chances = ler.nextInt();
                while (chances < 1 || chances > 50) {
                    System.out.println("ERRO!! Escreva um número entre 1 a 50\nTentativas (1-50): ");
                    chances = ler.nextInt();
                }
                tentativas = 1;
                pont = chances * 10;
                System.out.println("Você terá " + pont + " pontos iniciais (" + chances + " tentativas × 10 pontos)");
                break;
        }

        System.out.println("Você começa com " + pont + " pontos e perde 10 pontos por tentativa errada.");
        System.out.println("Se acertar em menos de 5 tentativas, ganha 50 pontos bônus.");
        System.out.println("---------------------------------------------");
        System.out.print("Escreva um número: ");
        int n = ler.nextInt();
        while (n < 0 || n > 100) {
            System.out.println("ERRO! Número tem que estar entre 1 a 100.\nDigite novamente o número: ");
            n = ler.nextInt();
        }
        int dif;
        while (n != ns && chances > 0) {
            dif = Math.abs(n - ns);
            System.out.println("---------------------------------------------");
            if (dif <= 5) {
                System.out.println("Muito quente!");
            } else if (dif <= 10) {
                System.out.println("Quente!");
            } else if (dif <= 20) {
                System.out.println("Morno");
            } else {
                System.out.println("Frio!");
            }
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
            System.out.println("---------------------------------------------");
            System.out.print("Tente novamente: ");
            n = ler.nextInt();
            while (n < 0 || n > 100) {
                System.out.println("ERRO! Número tem que estar entre 1 a 100.");
                System.out.println("Digite novamente o número: ");
                n = ler.nextInt();
            }
        }

        if (n == ns) {
            System.out.println("---------------------------------------------");
            System.out.println("Parabéns! Você acertou o número.");
            if (tentativas < 5) {
                pont += 50;
                System.out.println("Bônus de 50 pontos por acertar rápido.");
            }
            System.out.println("Sua pontuação final: " + pont + " pontos.");
            System.out.println("Número de tentativas: " + tentativas);
            if (recorde < pont) {
                System.out.println("===============NOVO RECORDE===============");
                System.out.println("Seu antigo recorde: " + recorde + " pontos");
                System.out.println("Seu novo recorde: " + pont + " pontos");
                recorde = pont;
            }
            v++;
        } else {
            System.out.println("\nVocê perdeu. O número era: " + ns);
            de++;
        }
            System.out.println("---------------------------------------------");
            System.out.println("Placar: Wins " + v + " x " + de + " Losses");
            double porcentagemVitorias = (v + de == 0) ? 0 : (v * 100.0) / (v + de);
            System.out.println("Taxa de vitórias: " + String.format("%.1f", porcentagemVitorias) + "%");
            System.out.println("---------------------------------------------");
            System.out.println("Deseja jogar novamente? (y/n): ");
        char menu = ler.next().charAt(0);
        if (menu == 'y' || menu == 'Y'){
            System.out.println("=== NOVA PARTIDA ===");
        }
        else if (menu == 'n' || menu == 'N') {
            break;
        }
    }
        System.out.println("---------------------------------------------");
        System.out.println("Placar final: Wins " + v + " x " + de + " Losses");
        System.out.println("Obrigado por jogar!!");
        System.out.println("---------------------------------------------");
    }
}
//Feito por Esteveszin

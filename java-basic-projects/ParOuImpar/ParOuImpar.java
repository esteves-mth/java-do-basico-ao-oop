import java.util.Random;
import java.util.Scanner;


public class ParOuImpar {
    public static void separador() {
        System.out.println("-------------------");
    }
    public static void separadord() {
        System.out.println("===================");
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int menu = 1;
        int pj = 0;
        int pc = 0;
        System.out.println("=== PAR OU IMPAR ===");
        while (menu == 1) {
            System.out.print("Escolha 1 para Impar ou 2 para Par: ");
            int escolha = ler.nextInt();
            while (escolha != 1 && escolha != 2) {
                System.out.println("ERRO!! Digite 1 ou 2");
                System.out.print("Escolha 1 para Impar ou 2 para Par: ");
                escolha = ler.nextInt();
            }
            System.out.print("Escolha um número entre 0 a 10: ");
            int number = ler.nextInt();
            while (number < 0 || number > 10) {
                System.out.print("ERRO! Digite um entre 0 e 10: ");
                number = ler.nextInt();
            }
            int n = random.nextInt(0, 11);
            int resultado = n + number;
            boolean resultadoPar = resultado % 2 == 0;
            separador();
            System.out.println("Você escolheu: " + number);
            System.out.println("Computador escolheu: " + n);
            System.out.println("Soma = " + resultado + " -> " + (resultadoPar ? "Par" : "Ímpar"));
            separador();
            if ((escolha == 1 && !resultadoPar) || (escolha == 2 && resultadoPar)) {
                System.out.println("Você ganhou!!");
                pj++;
            } else {
                System.out.println("Você perdeu!!");
                pc++;
            }
            separadord();
            System.out.println("Placar: Você " + pj + " x " + pc + " Computador");
            separadord();
            System.out.print("Quer jogar de novo? (1 - sim/2 - não): ");
            menu = ler.nextInt();
            separador();
            while (menu != 1 && menu != 2) {
                System.out.println("ERRO! Digite 1 ou 2");
                System.out.print("Quer jogar de novo? (1 - sim/2 - não): ");
                menu = ler.nextInt();
            }
            if (menu == 1) {
                System.out.println("=== NOVA PARTIDA ===");
            }
        }
        if (pj > pc) {
            System.out.println("Você foi o grande vencedor! Placar final: " + pj + " x " + pc);
        } else if (pc > pj) {
            System.out.println("O computador foi o grande vencedor! Placar final: " + pj + " x " + pc);
        } else {
            System.out.println("Empate! Placar final: " + pj + " x " + pc);
        }
        System.out.println("Obrigado por jogar!!");
        separador();
    }
}
//Feito por Esteveszin

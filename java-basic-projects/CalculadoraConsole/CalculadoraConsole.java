import java.util.Scanner;

public class CalculadoraConsole {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while (true) {
            System.out.print("Escreva o 1ºnúmero: ");
            int n1 = ler.nextInt();
            System.out.print("Escreva a operação: ");
            char opr = ler.next().charAt(0);
            while (opr != '+' && opr != '-' && opr != '/' && opr != '*' && opr != '%' && opr != '^') {
                System.out.println("ERRO!! Digite a operação correta (+ - * / % ^)");
                System.out.print("Escreva a operação: ");
                opr = ler.next().charAt(0);
            }
            System.out.print("Escreva o 2ºnúmero: ");
            int n2 = ler.nextInt();
            double rf = 0.0;
            switch (opr) {
                case '+':
                    rf = n1 + n2;
                    break;
                case '-':
                    rf = n1 - n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("ERRO!! Divisão por zero não é permitida!");
                        return;
                    }
                    rf = (double) n1 / n2;
                    break;
                case '*':
                    rf = n1 * n2;
                    break;
                case '%':
                    if (n2 == 0) {
                        System.out.println("ERRO!! Divisão por zero não é permitida!");
                        return;
                    }
                    rf = n1 % n2;
                    break;
                case '^':
                    rf = Math.pow(n1, n2);
                    break;
            }
            if (rf == (int) rf) {
                System.out.printf("%d %c %d = %d%n", n1, opr, n2, (int) rf);
            } else {
                System.out.printf("%d %c %d = %.2f%n", n1, opr, n2, rf);
            }
            System.out.println("Deseja fazer mais um calculo (y/n): ");
            char menu = ler.next().charAt(0);
            if (menu == 'n' || menu == 'N'){
                break;
            }
        }
        System.out.println("Obrigado!");
    }
} //Feito por Esteveszin

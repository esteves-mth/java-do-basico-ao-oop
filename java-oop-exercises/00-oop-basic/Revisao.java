import java.util.Arrays;
import java.util.Scanner;

public class Revisao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantos alunos têm na sala: ");
        int qa = ler.nextInt();
        int notas [] = new int [qa];
        int soma = 0;
        int aprovado = 0;
        int reprovado = 0;
        for (int v = 0; v < qa; v++) {
            System.out.print("Aluno " + (v+1) + ": ");
            notas [v] = ler.nextInt();
            while (notas[v] > 10 || notas[v] < 0){
                System.out.println("Digite novamente!!");
                System.out.print("Aluno " + (v+1) + ": ");
                notas [v] = ler.nextInt();
            }
            soma+=notas[v];
            if (notas[v] >= 7){
                aprovado++;
            }
            else{
                reprovado++;
            }
        }
        double mediadaturma = (double) soma/qa;
        Arrays.sort(notas);
        System.out.println("A média da turma: " + mediadaturma);
        System.out.println("O menor valor da turma: " + notas[0]);
        System.out.println("O maior valor da turma: " + notas[qa-1]);
        System.out.println("A " + aprovado + " alunos aprovadas e " + reprovado + " alunos reprovados na turma.\n");
        System.out.println("Tabuada da maior nota (" + notas[qa-1] + "):");
        for (int t = 0; t <= 10; t++) {
            System.out.println(notas[qa-1] + " x " + t + " = " + (notas[qa-1] * t));
        }
        int menu = 0;
        int escolhernota = 0;
        while (menu != 4){
            System.out.println("1 - Listar todas as notas");
            System.out.println("2 - Mostrar apenas notas pares");
            System.out.println("4 - Sair");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    for (int l = 0; l < qa; l++) {
                        System.out.println("Nota do Aluno " + (l+1) + ": " + notas[l]);
                    }
                    break;
                case 2:
                    for (int p = 0; p < qa; p++) {
                        if (notas[p] % 2 == 0) {
                            System.out.println("Nota do Aluno " + (p + 1) + ": " + notas[p]);
                        }
                        else{
                            continue;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escreva o número novamente.");
            }

        }

    }
}

//Feito por Esteveszin

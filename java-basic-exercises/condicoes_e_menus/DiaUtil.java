import java.util.Scanner;

public class DiaUtil{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("         Dia Util");
        System.out.print("----------------------------\n");
        System.out.print("Digite o numero da semana: ");
        int numerodasemana = leia.nextInt();
        switch (numerodasemana) {
            case 1:
                System.out.println("----------------------------");
                System.out.println("Domingo");
                System.out.println("----------------------------\n");
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Segunda-Feira");
                System.out.println("----------------------------\n");
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("Terça-Feira");
                System.out.println("----------------------------\n");
                break;
            case 4:
                System.out.println("----------------------------");
                System.out.println("Quarta-Feira");
                System.out.println("----------------------------\n");
                break;
            case 5:
                System.out.println("----------------------------");
                System.out.println("Quinta-Feira");
                System.out.println("----------------------------\n");
                break;
            case 6:
                System.out.println("----------------------------");
                System.out.println("Sexta-Feira");
                System.out.println("----------------------------\n");
                break;
            case 7:
                System.out.println("----------------------------");
                System.out.println("Sábado");
                System.out.println("----------------------------\n");
                break;
            default:
                System.out.println("\n----------------------------");
                System.out.println("Digite um numero de 1 a 7");
                System.out.println("----------------------------\n");
                break;
        }
    }
}

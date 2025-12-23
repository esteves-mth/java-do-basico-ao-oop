import java.util.Scanner;

public class MenuSimples {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n=== MENU ===");
        System.out.print("1 - Mostrar mensagem nº1\n2 - Sair\n3- Mostrar mensagem nº2\nEscreva sua opção: ");
        int menu = ler.nextInt();

        while (menu!=2) {
            switch (menu) {
                case 1:
                System.out.println("Você escolheu a opção 1: Olá, seja bem-vindo!");  
                    break;
                case 3:
                System.out.println("Você escolheu a opção 3: Hoje é um ótimo dia para estudar Java!"); 
                    break;
                default:
                System.out.println("Opção inválida! Digite um número entre 1 e 3.");
                    break;
            }
            System.out.println("\n=== MENU ===");
            System.out.print("1 - Mostrar mensagem nº1\n2 - Sair\n3- Mostrar mensagem nº2\nEscreva sua opção: ");
            menu = ler.nextInt();
        }

        System.out.println("Saindo do menu... Até mais!");

    }
    
}

import java.util.Scanner;

public class ConvertorString {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menu = 1;

        System.out.print("-------------------------------------------\n");
        System.out.println("      Convertor de Texto     ");
        System.out.print("-------------------------------------------\n");
        System.out.print("Escreva seu texto: ");
        String texto = ler.nextLine();
        System.out.print("-------------------------------------------\n");

        do {
        System.out.println("Qual funcionalidade você deseja usar: \n  1 - Deixar o texto todo em maisculo\n  2 - Deixar o texto todo em minusculo\n  3- Encontrar onde começar determinada palavras\n  4- Saber quantos caracteres seu texto tem\n  0 - Sair\n");
        menu = ler.nextInt();
        ler.nextLine();
            switch (menu) {
                case 0: 
                System.out.println("Saindo do programa...");
                System.out.print("-------------------------------------------\n");
                break;
                case 1: System.out.print("-------------------------------------------\n");
                System.out.println("      Maiúsculo    ");
                 System.out.print("-------------------------------------------\n");
                 System.out.println(texto.toUpperCase());
                 System.out.print("-------------------------------------------\n");

                     break;
                case 2: System.out.print("-------------------------------------------\n");
                System.out.println("      Minúsculo    ");
                 System.out.print("-------------------------------------------\n");
                 System.out.println(texto.toLowerCase());
                 System.out.print("-------------------------------------------\n");
                
                     break;

                case 3:System.out.print("-------------------------------------------\n");
                System.out.println("      Encontrar index    ");
                 System.out.print("-------------------------------------------\n");
                 System.out.println("Escreva qual palavra deseja: ");
                 String p = ler.nextLine();
                 int index = texto.indexOf(p);
                    if (index != -1) {
                        System.out.println("A palavra \"" + p + "\" está localizada a partir do " + index + "º caractere.");
                    } else {
                        System.out.println("Palavra não encontrada.");
                    }
                     System.out.println("-------------------------------------------");
                    break;
                 case 4:System.out.print("-------------------------------------------\n");
                System.out.println("     Quantos caracteres   ");
                 System.out.print("-------------------------------------------\n");
                 System.out.println("\nSeu texto tem no total " + texto.length() + " caracteres.");
                 System.out.print("-------------------------------------------\n");
                     break;
            default: System.out.println("Não há essa alternativa");
            System.out.print("-------------------------------------------\n");
                break;
    } }while(menu!=0);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {
    
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);


        System.out.print("-------------------------------------------\n");
        System.out.println("            Lista de Nomes     ");
        System.out.print("-------------------------------------------\n");
        System.out.print("Escreva quantos nomes deseja armazenar: ");
        int armaz = ler.nextInt();
        System.out.print("-------------------------------------------\n");
        System.out.println("       Cadastre os nomes a seguir:     ");
        System.out.print("-------------------------------------------\n");

        for (int i = -1; i < armaz; i++) {
            lista.add(ler.nextLine());
        }
        System.out.print("-------------------------------------------\n");
        System.out.println("                 Nomes:     ");
        System.out.print("-------------------------------------------\n");
        for (String i : lista) {
            System.out.println(i);
        }
        System.out.print("-------------------------------------------\n");

    }
}

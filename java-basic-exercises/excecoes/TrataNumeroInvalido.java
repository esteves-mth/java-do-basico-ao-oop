import java.util.Scanner;

public class TrataNumeroInvalido {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        

        while (true){
            System.out.print("Digite um número: ");
            String ent = leia.nextLine();
        
        try {
            int nu = Integer.parseInt(ent);
            System.out.println("Número cadastrado: " + nu);
            break;
            }
        catch (NumberFormatException e) {
            System.out.println("Escreva um número válido!");
        }
    }
}
    
}

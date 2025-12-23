import java.util.Scanner;

public class TrataExcecao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        

        while (true){
            System.out.print("Escreva sua idade: ");
            String ent = ler.nextLine();
        
        try {
            int idade = Integer.parseInt(ent);

            if (idade < 0 || idade > 125){
                System.out.println("Entrada inválida. Digite sua idade corretamente.");
            }
            else{
                System.out.println("Idade cadastrada.");
                break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Escreva apenas números!");
        }
    }
}
    
}

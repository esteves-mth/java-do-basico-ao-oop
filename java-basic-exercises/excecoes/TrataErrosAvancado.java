import java.util.Scanner;

public class TrataErrosAvancado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean validarnome = false;
        boolean validaridade = false;
        String nome = "";
        int idade = 0;

        System.out.println("\nCadastre-se:\n\n");
        while (!validarnome) {
            try {
                System.out.print("Digite seu nome: ");
                nome = ler.nextLine();
                if (nome.isEmpty()) {
                    throw new NullPointerException("O nome não pode estar vazio!!");
                }
                validarnome = true;
            } catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
        }
        while (!validaridade) {
            try {
                System.out.print("Digite sua idade: ");
                String idadeStr = ler.nextLine();
                idade = Integer.parseInt(idadeStr);
                validaridade = true;
            } catch(NumberFormatException e){
                System.out.println("Escreva um número corretamente!!");
            }
        }
        System.out.println("\nCadastro finalizado:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class TabelaMultiplicacaoSimples {
    public static void main(String[] args) {
            System.out.printf("%4s", "");
            for (int s = 1; s <= 5; s++){
                System.out.printf("%4d", s);
            }

            for (int i = 1; i <= 5; i++) {
                System.out.printf("\n%4d", i);
                for (int j = 1; j <= 5; j++){
                    System.out.printf("%4d", i*j);
            }
        }

        
    }
    }

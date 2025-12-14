import java.util.ArrayList;
public class PaymentTest {
    public static void main(String[] args) {
        ArrayList<Payment> pagamentos = new ArrayList<>();

        pagamentos.add(new CreditCard("1234567812345678", "João Silva", 2026, false));
        pagamentos.add(new PayPal("joao@email.com", "PAY123"));
        pagamentos.add(new BankTransfer("Banco Central", "987654", "REF001"));

        for (Payment p : pagamentos) {
            p.processPayment(100.0);
            System.out.println("Método: " + p.getPaymentMethod());
            System.out.println("Status: " + (p.isPaymentSuccessful() ? "Aprovado" : "Recusado"));
            System.out.println();
        }
        for (Payment p : pagamentos) {
            System.out.println(p.getPaymentDetails());
        }
    }
}

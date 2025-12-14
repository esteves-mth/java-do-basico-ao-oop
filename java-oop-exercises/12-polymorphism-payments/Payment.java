public interface Payment {
    void processPayment(double amount);
    String getPaymentDetails();
    String getPaymentMethod();
    boolean isPaymentSuccessful();
}

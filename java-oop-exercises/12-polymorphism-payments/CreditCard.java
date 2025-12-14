import java.util.Date;
public class CreditCard implements Payment{
    private String cardNumber;
    private String cardHolder;
    private int expiryYear;
    private boolean expired;
    private boolean paymentSuccessfull;

    public CreditCard(String cardNumber, String cardHolder, int expiryYear, boolean expired) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryYear = expiryYear;
        this.expired = ((expiryYear - java.time.Year.now().getValue()) < 0);
        this.paymentSuccessfull = false;
    }

    @Override
    public void processPayment(double amount) {
        if (getCardNumber().length() == 16){
            if (!isExpired()){
                this.paymentSuccessfull = true;
            }
        }
    }

    @Override
    public String getPaymentDetails() {
        if (isPaymentSuccessful()){
            return this.cardNumber.charAt(0) + this.cardNumber.charAt(1) + this.cardNumber.charAt(2) + this.cardNumber.charAt(3) + "-" +
                    this.cardNumber.charAt(4) + this.cardNumber.charAt(5) + this.cardNumber.charAt(6) + this.cardNumber.charAt(7) + "-" +
                    this.cardNumber.charAt(8) + this.cardNumber.charAt(9) + this.cardNumber.charAt(10) + this.cardNumber.charAt(11) + "-" +
                    this.cardNumber.charAt(12) + this.cardNumber.charAt(13) + this.cardNumber.charAt(14) + this.cardNumber.charAt(15) + ", Titular: " + getCardHolder();
        }
        return "...";

    }

    @Override
    public String getPaymentMethod() {
        return "Cartão de Crédito";
    }

    @Override
    public boolean isPaymentSuccessful() {
        return paymentSuccessfull;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }


    public int getExpiryYear() {
        return expiryYear;
    }


    public boolean isExpired() {
        return expired;
    }

}

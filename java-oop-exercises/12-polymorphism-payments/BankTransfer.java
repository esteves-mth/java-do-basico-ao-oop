public class BankTransfer implements Payment{
    private String bankName;
    private String accountNumber;
    private String reference;
    private boolean paymentSuccessful;

    public BankTransfer(String bankName, String accountNumber, String reference) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.reference = reference;
        this.paymentSuccessful = false;
    }

    @Override
    public void processPayment(double amount) {
        if (getAccountNumber().length() >= 5){
            this.paymentSuccessful = true;
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Transferência: Banco " + getBankName() + ", Conta: " + getAccountNumber() + "Ref: " + getReference();
    }

    @Override
    public String getPaymentMethod() {
        return "Transferência Bancária";
    }

    @Override
    public boolean isPaymentSuccessful() {
        return this.paymentSuccessful;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getReference() {
        return reference;
    }
}

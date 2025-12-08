public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        if (initialBalance < 0){
            this.balance = 0;
        }
        else {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= getBalance()){
            this.balance -= amount;
        }
    }
}

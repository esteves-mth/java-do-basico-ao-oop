public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(0);
        a.deposit(1000);
        System.out.println(a.getBalance());
        a.withdraw(100);
        System.out.println(a.getBalance());
        a.withdraw(1000);
        System.out.println(a.getBalance());
        a.deposit(100);
        System.out.println(a.getBalance());
        a.withdraw(1000);
        System.out.println(a.getBalance());
    }
}

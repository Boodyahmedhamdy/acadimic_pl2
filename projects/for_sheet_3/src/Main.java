import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.depoist(3000);
        System.out.println("balance: " + account.getBalance() + "$");
        System.out.println("monthly rate is " + account.getMonthlyInterestRate() + "$");
        System.out.println("the account was created in " + account.getDateCreated());
    }
}

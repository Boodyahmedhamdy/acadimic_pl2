import java.time.LocalDate;

public class Account {
    private int ID;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;

// the default constructor
    Account() {
        this.ID = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = LocalDate.now();
    }

    // another constructor
    Account(int id, double balance) {
        this.ID = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = LocalDate.now();
    }

    // getters and setters

    // ID
    public int getID() {
        return this.ID;
    }
    public void setID(int id){
        this.ID = id;
    }

    // balance
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // annual interest rate
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // date created
    public LocalDate getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return ((this.annualInterestRate / 100) * this.balance) / 12.0;
    }

    public void withdraw(double money) {
        this.balance = this.balance - money;
    }

    public void depoist(double money) {
        this.balance = this.balance + money;
    }

}


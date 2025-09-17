package Java_OOPS.Encapsulation;

import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber, holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber; this.holderName = holderName; this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan(double amount) { System.out.println("Savings Loan Applied: " + amount); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.02; }

    @Override
    public void applyForLoan(double amount) { System.out.println("Current Account Loan Applied: " + amount); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

public class BankingTest {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
                new SavingsAccount("S001", "Alice", 8000),
                new CurrentAccount("C001", "Bob", 15000)
        );

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable)acc;
                l.applyForLoan(5000);
                System.out.println("Loan Eligible: " + l.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}

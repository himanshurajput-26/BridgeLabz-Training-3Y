package Java_OOPS.Inheritance;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber; this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int duration;

    FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance); this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Duration: " + duration + " months");
    }
}

public class BankTest {
    public static void main(String[] args) {
        new SavingsAccount("S001", 5000, 4.5).displayAccountType();
        new CheckingAccount("C001", 2000, 1000).displayAccountType();
        new FixedDepositAccount("FD001", 10000, 12).displayAccountType();
    }
}

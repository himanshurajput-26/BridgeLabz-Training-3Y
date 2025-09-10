package Java_OOPS.Level2;

// BankAccount.java
class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance = " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance = " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "Himanshu", 5000);
        account.displayAccount();
        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(5000);
    }
}

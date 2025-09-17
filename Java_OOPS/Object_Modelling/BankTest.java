package Java_OOPS.Object_Modelling;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name; this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) { this.bankName = bankName; }

    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name + " at " + bankName);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank b = new Bank("SBI Bank");
        Customer c1 = new Customer("Alice", 5000);
        b.openAccount(c1);
        c1.viewBalance();
    }
}

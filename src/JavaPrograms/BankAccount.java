package JavaPrograms;

class BankAccount {
    String account_holder_name;
    double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        account_holder_name = name;
        balance = initialBalance;
    }

    // Deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Rahul", 5000);

        account.checkBalance();

        account.deposit(2000);

        account.withdraw(1500);

        account.checkBalance();
    }
}
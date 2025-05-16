package homework;

public class Account implements BankingService {
    private double balance;
    private String accountName;
    private String lastTransaction = "No transaction yet";

    // Constructor with initial balance
    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    // Constructor without initial balance (default to 0.0)
    public Account(String accountName) {
        this.accountName = accountName;
        this.balance = 0.0;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=0){
            System.out.println("Invalid amount. Please enter a positive number");
        } else if (amount > balance) {
            System.out.println("[!] Cannot withdraw, because your balance is greater than current balance");
            return;
        }else
        balance -= amount;
        lastTransaction = "Withdrew $" + amount;
        System.out.println("[+] Withdrawn successfully from " + accountName + "'s account");
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0.0) {
            System.out.println("[!] Cannot deposit , because your balance is not enough");
            return;
        }
        balance += amount;
        lastTransaction = "Deposited $" + amount;
        System.out.println("[+] Deposited successfully to " + accountName + "'s account");
    }

    @Override
    public void showBalance() {
        System.out.println("========Balance Account==============");
        System.out.println("[+] Account Name: " + accountName);
        System.out.println("[+] Balance: $" + balance);
    }

    public void transfer(Account receiver, double amount) {
        if (amount <= 0) {
            System.out.println("[!] Cannot transfer non-positive amount");
            return;
        }
        if (this.balance >= amount) {
            this.balance -= amount;
            receiver.balance += amount;

            this.lastTransaction = "Transferred $" + amount + " to " + receiver.accountName;
            receiver.lastTransaction = "Received $" + amount + " from " + this.accountName;

            System.out.println("[+] " + this.lastTransaction);
        } else {
            System.out.println("[!] Insufficient balance for transfer.");
        }
    }

    public void transitionHistory() {
        System.out.println("[History] " + accountName + ": " + lastTransaction);
    }
}

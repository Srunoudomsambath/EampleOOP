package homework;

public interface BankingService {
    void withdraw(double cash);
    void deposit(double cash);
    void showBalance();
    void transfer(Account receiver, double amount);
    void transitionHistory();
}


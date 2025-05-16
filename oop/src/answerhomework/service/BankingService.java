package answerhomework.service;

public interface BankingService {
    void withdraw(Long cash);
    void deposit(Long cash);
    void showBalance();
    void transfer(Long cash, Long amount);
}

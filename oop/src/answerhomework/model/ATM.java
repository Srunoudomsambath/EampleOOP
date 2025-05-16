package answerhomework.model;

import answerhomework.service.BankingService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ATM implements BankingService {
    private final CreditCard creditCard;
    @Override
    public void withdraw(Long cash) {
        creditCard.getAccount().withdraw(cash);

    }

    @Override
    public void deposit(Long cash) {
        creditCard.getAccount().deposit(cash);

    }

    @Override
    public void showBalance() {
        creditCard.getAccount().showBalance();

    }
    @Override
    public void transfer(Long from, Long to) {
        creditCard.getAccount().transfer(from, to);
    }
}

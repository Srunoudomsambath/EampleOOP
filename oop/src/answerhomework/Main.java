package answerhomework;

import answerhomework.model.Accounts;
import answerhomework.model.SavingAccount;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
    Accounts acc1 = new Accounts();
    acc1.setAccountName("John");
    acc1.setAccountNumber("12345");
    acc1.setUuid(UUID.randomUUID().toString());
    acc1.deposit(100L);
    acc1.withdraw(20L);
    acc1.showBalance();

    Accounts acc2 = new Accounts();
    acc2.setAccountName("Sambath");
    acc2.setAccountNumber("12345");
    acc2.setUuid(UUID.randomUUID().toString());
    acc2.showBalance();

        System.out.println("After transfer");
    }
}

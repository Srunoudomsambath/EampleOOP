package homework;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
                Account creditAccount = new CreditAccount("527-998-098-440-8225",LocalDateTime.of(2028,12,2,3,4,5),"3");
                creditAccount.deposit(500);
                creditAccount.withdraw(100);
                creditAccount.showBalance();
                Account sambath = new Account("Sambath", 500);
                Account bob = new Account("Bob", 300);
                System.out.println("Sambath makes a deposit of 200:");
                sambath.deposit(200);
                sambath.showBalance();
                System.out.println("\nSambath withdraws 100:");
                sambath.withdraw(100);
                sambath.showBalance();
                System.out.println("\nSambath transfers 150 to Bob:");
                sambath.transfer(bob, 150);
                sambath.showBalance();
                bob.showBalance();
                creditAccount.showBalance();
                System.out.println("\nTransaction History for Sambath:");
                sambath.transitionHistory();
                System.out.println("\nTransaction History for Bob:");
                bob.transitionHistory();
    }
}




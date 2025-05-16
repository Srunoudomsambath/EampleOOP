package answerhomework.model;

import answerhomework.service.BankingService;
import lombok.*;


import java.time.LocalDate;

//concrete class
@Data
@Getter
public class Accounts implements BankingService {
    private Integer id;
    private String uuid;
    private String accountName;
    private String accountNumber;
    private LocalDate createDate;
    private LocalDate expiryDate;
    private String profile;
    private String gender;
    private Long cash=0L;
    @Override
    public void withdraw(Long cash) {
        if(cash >this.cash){
            System.out.println("Account withdrawal failed");
        }else if(cash <0){
            System.out.println("Account withdrawal failed");
        }
        this.cash -= cash;
        System.out.println("Account withdrawal successful");
    }

    @Override
    public void deposit(Long cash) {
        if(cash<0){
            System.out.println("Account deposit failed");
            return;
        }
        this.cash += cash;
        System.out.println("Account deposit successful");

    }

    @Override
    public void showBalance() {
        System.out.println("-".repeat(30));
        System.out.println("Account Name: " + accountName );
        System.out.println("Cash : $" + cash);


    }
    @Override
    public void transfer(Long cash, Long accountId) {
        if(cash >this.cash){
            System.out.println("Account transfer failed");
        }else if(cash <0){
            System.out.println("Account transfer failed");
        }
        this.cash -= cash;
        System.out.println("Account transfer successful");
    }
}

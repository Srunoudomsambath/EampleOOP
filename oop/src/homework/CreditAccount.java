package homework;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class CreditAccount extends Account {
    private String cardNumber;
    private LocalDateTime expiryDate;
    private String secretNumber;
    public CreditAccount(String cardNumber, LocalDateTime expiryDate,String secretNumber) {
        super("Credit Account");
        this.cardNumber = cardNumber;
        this.secretNumber = secretNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void showBalance() {
        super.showBalance();
        System.out.println("[+] Card Number: " + cardNumber);
        System.out.println("[+] Expiry Date: " + expiryDate);
    }
}


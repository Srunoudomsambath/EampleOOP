package answerhomework.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
//it make constructor parameter
@RequiredArgsConstructor
@Getter
//get value of account in mobile app
public class CreditCard {
    private final Accounts account;
}

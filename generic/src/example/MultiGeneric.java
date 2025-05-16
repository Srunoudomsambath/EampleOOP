package example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class Utils<T,U,V>{
    private final T content;
    private final U data;
    private final V date;
}
enum UserRole{
    ROLE_ADMIN,
    ROLE_SUPER_ADMIN,
    ROLE_USER
}
public class MultiGeneric {
    public static void main(String[] args) {
        Utils<UserRole , Integer , String > utils = new Utils<>(UserRole.ROLE_ADMIN,20,"Sambath");
        System.out.println(utils.getContent());
        System.out.println(utils.getData());
        System.out.println(utils.getDate());

    }
}

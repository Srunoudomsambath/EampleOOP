package example;

import lombok.Builder;
import lombok.ToString;

import java.time.Instant;
import java.util.Date;

record UserDto<T>(
    Integer status,
    Date timeStamp,
    T data,
    String message
){}
@Builder
@ToString
class User {
    private Integer id;
    private String uuid;
    private String name;
    private String profile;
}
@interface MyAnnotation {

}
public class Record {
    public static void main(String[] args) {
        UserDto<String> userDto = new UserDto<>(200,Date.from(Instant.now()),"myEmployee","hello");
        System.out.println(userDto);

        //Builder, so we don't want to insert all data of user
        //example facebook user do
        // es not have a profile yet, so we don't insert it
        User user = User.builder()

                .id(2)
                .name("myEmployee")
                .profile("Sambath")
                .build();
        System.out.println(user);


        AddNumbers add = (a,b) -> a + b;
        System.out.println(add.add(5,3));
    }
}
interface AddNumbers{
    int add(int a, int b);
}
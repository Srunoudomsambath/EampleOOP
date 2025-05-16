package arraylist;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@ToString
class User{
    private Integer id;
    private String uuid;
    private String name;
    private String email;
}
public class ListObject {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>(
                List.of(User.builder()
                        .id(1)
                        .uuid(UUID.randomUUID().toString())

                        .email("sambath@gmail.com")
                        .build(),User.builder()
                        .id(2)
                        .uuid(UUID.randomUUID().toString())
                        .name("kaka")
                        .email("kaka@gmail.com")
                        .build())
        );
        userList.stream()
                .filter(e->e.getId().equals(1))
                .forEach(System.out::println);
    }
}

package arraylist.repository;

import arraylist.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRepository {
    public static List<User> userList = new ArrayList<>(
            List.of(User.builder()
                    .id(1)
                    .uuid(UUID.randomUUID().toString())
                    .name("samrach")
                    .email("samrach@gmail.com")
                    .build()));

}

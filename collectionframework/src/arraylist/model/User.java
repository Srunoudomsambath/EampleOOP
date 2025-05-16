package arraylist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
public class User {
    private Integer id;
    private String uuid;
    private String name;
    private String email;
}

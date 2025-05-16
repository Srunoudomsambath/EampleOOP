//package example;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//import java.util.UUID;
////T object class, U identifier is id
////decouple separate couple and tight couple make couple
//interface Repository<T,U>{
//    List<T> getAllUser();
//    T findByUuid(U id);
//    Integer delete();
//    T save();
//}
//@AllArgsConstructor
//@Data
//class User{
//    private Integer id;
//    private String uuid;
//    private String name;
//}
//
//class UserRepository implements Repository<User,Integer>{
//    @Override
//    public List<User> getAllUser() {
//        return List.of(new User(1, UUID.randomUUID().toString(), "John Doe"), new User(2, UUID.randomUUID().toString(), "Jane Doe"));
//    }
//
//    @Override
//    public User findByUuid(Integer id) {
//        for(User u : getAllUser()){
//            if(u.getId().equals(id)){
//                return u;
//            }
//        }
//    }
//
//    @Override
//    public Integer delete() {
//        for(User u : getAllUser()){
//            if(u.getId()==id){
//                getAllUser().remove(u);
//                return 0;
//            }
//        }
//    }
//
//    @Override
//    public User save() {
//        return null;
//    }
//}
//
//public class InterfaceGeneric {
//    public static void main(String[] args) {
//
//    }
//}

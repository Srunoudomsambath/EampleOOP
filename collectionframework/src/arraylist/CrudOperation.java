//package arraylist;
//
//import arraylist.model.User;
//import arraylist.service.UserService;
//
//import java.util.UUID;
//
//public class CrudOperation {
//    public static void main(String[] args) {
//    UserService userService = new UserService();
//    userService.getAllUsers()
//            .forEach(System.out::println);
//
//    userService.addNewUser(User.builder()
//                    .id(2)
//                    .uuid(UUID.randomUUID().toString())
//                    .name("sambath")
//                    .email("Sambath@gmail.com")
//            .build());
//
//    userService.getAllUsers().forEach(System.out::println);
//    }
//}

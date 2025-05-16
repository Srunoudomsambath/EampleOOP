//package arraylist.service;
//
//import arraylist.model.User;
//import arraylist.repository.UserRepository;
//
//import java.util.List;
//
//public class UserServiceImpl implements UserService{
//    @Override
//    public List<User> getAllUsers() {
//        return UserRepository.userList;
//    }
//
//    @Override
//    public User findUserByUuid(String uuid) {
//        return UserRepository.userList
//                .stream()
//                .filter(e->e.getUuid().equal(uuid))
//                .findFirst().get();
//    }
//
//    @Override
//    public User updateUserByUuid(String uuid) {
//        //copy data that search and delete the old one
//        for(User user : userList){
//            if(user.getUuid().equals(uuid)){
//            userList.remove(user);
//            User
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public User addNewUser(User user) {
//        boolean isAdded =UserRepository.userList.add(user);
//        return isAdded ? user : null;
//    }
//
//    @Override
//    public int deleteUserByUuid(String uuid) {
//        User user = UserRepository.userList
//                .stream()
//                .filter(e->e.get.equals(uuid))
//                        .toList().getFirst();
//                if(user != null){
//                    UserRepository.userList.remove(user);
//                    return 1;
//                }
//        return 0;
//    }
//}

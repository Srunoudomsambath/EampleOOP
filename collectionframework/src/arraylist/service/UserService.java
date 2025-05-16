package arraylist.service;

import arraylist.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User findUserByUuid(String uuid);
    User updateUserByUuid(String uuid);
    User addNewUser(User user);
    int deleteUserByUuid(String uuid);
}

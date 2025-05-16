package example;

import java.util.UUID;

class User{
    public int id;
    public String name;
    public String uuid;
    public String email;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setUserInfo(int id, String name, String uuid, String email) {
        this.id = id;
        this.name = name;
        this.uuid = uuid;
        this.email = email;

    }

    public void getUserInfo(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("uuid: " + uuid);
        System.out.println("email: " + email);
    }
}

public class Uuid {
    public static void main(String[] args) {
        User user = new User();
        user.setUserInfo(1,"sambath", UUID.randomUUID().toString(),"toyroith@gmail.com");
        user.getUserInfo();
        User user2 = new User();
        user2.setUserInfo(2,"Roith",UUID.randomUUID().toString(),"sambath@gmail.com");
        user2.getUserInfo();
        

    }
}

package Abstraction;
interface Service{
    void getAllUser();
    void getDBConnection();
}
class ServiceImp implements Service{
    public void getAllUser(){}
    public void getDBConnection(){}
    public void DisplayUser(){}
}
public class Main {
    public static void main(String[] args) {
        //Uppercase can not access method that not in interface but it abstraction
        Service service = new ServiceImp();
        service.getAllUser();
        service.getDBConnection();
//        service.displayUser();


        //Lowercase can access method that not in interface
        // but it's not fully abstraction because
        // when we click on method it will guide us to class not interface
        ServiceImp service2 = new ServiceImp();
        service2.getAllUser();
        service2.getDBConnection();
        service2.DisplayUser();
    }
}

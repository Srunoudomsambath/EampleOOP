package example;

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
class TeacherException extends Exception {
    public TeacherException(String message) {
        super(message);
    }
}
public class UserDefinedException {
    static int intputAge() throws MyException {
        try{
            System.out.println("Enter your age");
            return new Scanner(System.in).nextInt();
        }catch (Exception e){
            throw new MyException("Invalid input");
        }
    }
    public static void main(String[] args) {
        try{
            intputAge();
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}


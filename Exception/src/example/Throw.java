package example;

import java.util.Scanner;

public class Throw {
        static int intputAge() throws Exception{
            try {
                System.out.println("Insert your age");
                return new Scanner(System.in).nextInt();

            }catch (Exception exception){
                throw new Exception("Invalid Input");
            }
        }
        public static void main(String[] args) {
            try{
                intputAge();

            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
    }
}

package example;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        try{
            System.out.println("Insert you age");
            int age = new Scanner(System.in).nextInt();
            System.out.println("You are " + age + " years old");
        }catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}

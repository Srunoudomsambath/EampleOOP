package example;

public class Recursive {
    public static int factorial(int n) {
        if (n == 0 || n == 1){
            System.out.print("1");
            return 1;
        }
        System.out.print(n + " *");
        return n * factorial(n-1);
    }
    static int sum(int n) {
        if(n == 1){
            System.out.print("1");
            return 1;
        }
        System.out.print(n+ "+");
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int number = 3;
        System.out.print("Factorial of " + number + " is " );
        int result = factorial(number);
        System.out.println(" = " +result);
        int numbers= 5;
        System.out.print("Sum of " + numbers + " is " );
        int result2 = sum(numbers);
        System.out.println(" = " +result2);

    }
}

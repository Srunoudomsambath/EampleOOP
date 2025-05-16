package example;

public class Main {
    static void getValue(int ...numbers) {
        for (int e : numbers){
            System.out.println(e);
        }
    }
    static int sum(int ...numbers) {
        int sum = 0;
        for (int e : numbers){
            sum += e;
        }
        return sum;
    }
    static String getNewvalue(String name,int ...n) {
        System.out.println(name);
        return name+n;
    }

    public static void main(String[] args){
        System.out.println("First Call: ");
        getValue(1,2,3,4,5);
        sum(1,2,3,4,5);
        getNewvalue("sambath");

    }
}
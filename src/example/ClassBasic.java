package example;

class Util{
    protected void sum (int a, int b){
        System.out.println("result = " + a + " + " + b + " = " + (a + b));
    }
    public void substract (int a, int b){
        if(a>b){
            System.out.println("result = " + a + " - " + b + " = " + (a - b));
        }else{
            System.out.println("result = " + a + " - " + b + " = " + (a - b));
        }
    }
}

public class ClassBasic {
    public static void main(String[] args) {

    }
}

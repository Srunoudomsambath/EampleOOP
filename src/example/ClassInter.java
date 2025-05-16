package example;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void subtract(int a , int b ){
        if(a>b){
            System.out.println("Result of subtraction : " + (a-b));
        }else{
            System.out.println("Result of subtraction : " + (b-a));
        }
    }

}

public class ClassInter {
    public static void main(String[] args) {
        Person person = new Person("John",25);
        System.out.println("Before change");
        person.display();

        person.setAge(20);
        person.setName("sambath");
        System.out.println("After change");
        person.display();

        person.subtract(40,20);

    }
}

package oop;
class Person {
    private String name;
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {}
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person("John", 20);
        p1.setAge(30);
        p1.setName("Sambath");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p1);
        p1.display();
    }
}

package Polymorphism;

class Parent {
    public void display() {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child Constructor");
    }
    public void display2() {
        System.out.println("this is child constructor");
    }
}
class GrandChild extends Parent {
    @Override
    public void display() {
        System.out.println("GrandChild Constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
//        Parent child= new Child();
        child.display();
        GrandChild grandChild = new GrandChild();
        grandChild.display();
        child.display();
        child.display2();
    }
}

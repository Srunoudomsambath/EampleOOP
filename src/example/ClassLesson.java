package example;

class dog{
    int age;
    String name;
    public dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class ClassLesson {
    public static void main(String[] args) {
        dog d = new dog(15, "Dog");
        System.out.println(d.getAge());
        System.out.println(d.getName());

    }
}

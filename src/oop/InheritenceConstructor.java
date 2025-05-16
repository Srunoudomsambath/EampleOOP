package oop;
class Persons{
    int id ;
    String name;
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    public Persons(int id,String name){
        this.id=id;
        this.name= name;
    }
}
    class Teachers extends Persons{
    public Teachers(int id,String name){
        super(id,name);
    }

    }
public class InheritenceConstructor {
    public static void main(String[] args){
        Teachers teachers = new Teachers(1,"sambath");
        System.out.println("This is my id :" +teachers.getId());
        System.out.println("This is my name :"+teachers.getName());

    }
}

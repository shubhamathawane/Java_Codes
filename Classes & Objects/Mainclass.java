
public class Mainclass {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "Shubham";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "pintu";

        System.out.println("Age : "+ p1.age + " Name :" + p1.name);
        System.out.println("Age : "+ p2.age + " Name :" + p2.name);
        p1.walk();
        p2.eat();
    }
}
class Person {
    String name;
    int age;

    // Methods 
    void walk(){
        System.out.println(name + " is walking ");
    }
    void eat(){
        System.out.println(name + " is Eating ");
    }
}

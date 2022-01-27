// Write a java program to implement Default Constructor.
// Date : 27-01-2022 (Too late to upload on GitHub)
// Written by : Shubham Athawane

public class DefConstructor {
    String name;
    int roll_no;

    DefConstructor() {
        name = "Leonardo Dichaprio";
        roll_no = 20;
    }

    DefConstructor(String n, int r) {
        name = n;
        roll_no = r;
    }

    void display() {
        System.out.println("name : " + name);
        System.out.println("roll : " + roll_no);
    }

    public static void main(String args[]) {
        DefConstructor d1 = new DefConstructor();   // here default constructor will execute as soon as object is created
        DefConstructor d2 = new DefConstructor("Shubham", 44);

        d1.display();
        d2.display();
    }
}

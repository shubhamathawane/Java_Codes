// Write a java program to implement Parameterized Constructor.
// Date : 27-01-2022 (Too late to upload on GitHub)
// Written by : Shubham Athawane

public class ParaContructor {
    int stdId;
    String stdName;
    String stdClass;

    // Parameterized constructor with the two parameters
    ParaContructor(int id, String name) {
        stdId = id;
        stdName = name;
    }

    ParaContructor(int id, String name, String std) {
        stdId = id;
        stdName = name;
        stdClass = std;
        
    }

    void info() {
        // We can direclty show here by calling using -object
        // System.out.println("Id :" + stdId + " Name : "+stdName +" Class :
        // "+stdClass);
        System.out.println(" " + stdId + " " + stdName + " " + stdClass);
    }

    public static void main(String[] args) {

        ParaContructor obj1 = new ParaContructor(2262, "Shubham");
        ParaContructor obj2 = new ParaContructor(2222, "Nikhil Thorat");
        ParaContructor obj3 = new ParaContructor(2299, "Sudarshan Chavan", "CSE FY");
        obj1.info(); // Creating object and calling info to display the same
        obj2.info();
        obj3.info();
    }
}

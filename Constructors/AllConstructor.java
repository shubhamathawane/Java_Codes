// Write a java program to All Constructors.
// Date : 27-01-2022 (Too late to upload on GitHub)
// Written by : Shubham Athawane

// In this example i've show all the type of constructor in single program
// 1. Default Constructor
// 2. Parameterized Constructor
// 3. Copy Constructor

class student {
    String roll_no;
    String name;
    int m1, m2;
    double per;

    student() {
        // Return nothing (to execute default constructor)
    }

    student(String r, String n, int m11, int m22) {
        roll_no = r;
        name = n;
        m1 = m11;
        m2 = m22;
    }

    student(student d) {
        roll_no = d.roll_no;
        name = d.name;
        m1 = d.m1;
        m2 = d.m2;

    }

    void showDetails() {
        System.out.println(roll_no + " " + name + " " + m1 + " " + m2);
    }
}

class AllConstructor {

    public static void main(String[] args) {
        student s1 = new student();
        s1.showDetails(); // Default Construcot
        student s2 = new student("343", "shubham", 232, 343);
        s2.showDetails(); // Parameterized Constructor
        student s3 = new student(s2);
        s3.showDetails(); // Copy Constructor

    }
}
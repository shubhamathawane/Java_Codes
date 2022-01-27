// In this example i've show all the type of constructor in single program
// 1. Default Constructor
// 2. Parameterized Constructor
// 3. Copy Constructor

class student {
    int Stdage;
    String stdName;
    double stdPercentages;

    student(int age, String name, double per) {
        Stdage = age;
        stdName = name;
        stdPercentages = per;
    }

    student(student s) {
        Stdage = s.Stdage;
        stdName = s.stdName;
        stdPercentages = s.stdPercentages;
    }

    void showDetails() {
        System.out.println(Stdage + " " + stdName + " " + stdPercentages);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        student s1 = new student(18, "shubham", 89.62);
        s1.showDetails(); // Paramterize Constructor
        student s2 = new student(s1);
        s2.showDetails(); // Copy Constructor
    }
}

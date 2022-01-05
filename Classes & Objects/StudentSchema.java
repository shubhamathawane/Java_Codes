import java.util.*;
import java.util.Scanner;

class student {
    Scanner sc = new Scanner(System.in);
    String name;
    int roll_no;

    void fillStud() {
        System.out.print("Enter the Name of student : ");
        name = sc.nextLine();
        System.out.print("Enter the Roll No. of student : ");
        roll_no = sc.nextInt();
    }

    void showStud() {
        System.out.println("Student name : " + name);
        System.out.println("Student roll_no : " + roll_no);
    }
}

class marks extends student {

    int sub1marks, sub2marks, sub3marks, total = 0;
    float per;

    void fillResult() {
        System.out.print("Enter marks of subject 1 : ");
        sub1marks = sc.nextInt();
        System.out.print("Enter marks of subject 2 : ");
        sub2marks = sc.nextInt();
        System.out.print("Enter marks of subject 3 : ");
        sub3marks = sc.nextInt();
        System.out.println("========================================");
    }

    void showResult() {
        System.out.println("Marks of subject 1 is : " + sub1marks);
        System.out.println("Marks of subject 2 is : " + sub2marks);
        System.out.println("Marks of subject 3 is : " + sub3marks);
    }

    void addition() {
        total = sub1marks + sub2marks + sub3marks;
        System.out.println("Student percentages are : " + total / 3+"%");
        System.out.println("========================================");
    }
}

public class StudentSchema {
    public static void main(String[] args) {
        marks m = new marks();
        m.fillStud();
        m.fillResult();
        m.showStud();
        m.showResult();
        m.addition();
    }
}

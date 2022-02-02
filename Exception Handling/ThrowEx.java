import java.util.Scanner;

public class ThrowEx {
    static void checkEligibility(int studAge, int StudWeight) {
        if (studAge < 12 && StudWeight < 40) {
            throw new ArithmeticException("Student is not Eligible for Registration ");
        } else {
            System.out.println("Student Entry is Valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Registration !!");
        int age, weight;
        System.out.print("Enter student age : ");
        age = sc.nextInt();
        System.out.print("Enter student weight : ");
        weight = sc.nextInt();
        checkEligibility(age, weight);
        System.out.println("Have good day !!");

    }
}

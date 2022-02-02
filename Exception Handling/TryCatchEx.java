import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter No 1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter No 2 : ");
            num2 = sc.nextInt();
            num2 = num1 / num2;
            System.out.println(num2);
            System.out.println("End of try Block");
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide a Number by Zero");
        }
        System.out.println("Out of try catch Block ");
    }
}

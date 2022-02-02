import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number 1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            num2 = sc.nextInt();
            num2 = num1/num2;
            System.out.println("Division is : " +num2);
        }catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide Number by zero");
        }
        finally{
            System.out.println("This is Finally Block ");
        }
        System.out.println("Out of the Try-Catch-Finally ");

    }
}

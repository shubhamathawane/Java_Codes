import java.util.Scanner;

public class MultiCatchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the Number : ");
            int n = Integer.parseInt(sc.nextLine());
            if(99%n==0)
            {
                System.out.println(n + " Is a Factor of 99 ");
            }else{
                System.out.println(n + " Is not Factor of 99");
            }
        }catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Excetion  "+ e);
        }catch(NumberFormatException e)
        {
            System.out.println("Number Formate Exception : "+e);
        }
    }
}

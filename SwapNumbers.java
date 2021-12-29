import java.util.Scanner;

// Title : To find the addition  of numbers in String
// Name of coder : Shubham Athawane
// Email: Shubhamathawane02@gmail.com 

class SwapNumbers
{
   public static void main(String args[])
     {
      int x,y;
      System.out.println("Enter X and Y");
      Scanner in =new Scanner(System.in);
      x =in.nextInt();
      y =in.nextInt();
   
     System.out.println("Before Swapping" + "\nx = " + x + "\ny = " + y);

    x = x + y;
    y = x - y;
    x = x - y;
    
    System.out.println("After Swapping " + "\nx = " + x + "\ny = " + y);

    }
} 


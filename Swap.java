class Swap
{
  public static void main(String args[])
 { 
   
   int num1 = Integer.parseInt(args[]);
   int num2 = Integer.parseInt(args[1]);
 
  System.out.println("\n*****Before swapping The numbers");
  System.out.println("Number 1 :"+num1);
  System.out.println("Number 2 :"+num2);
  //swap logic
  num1=num1+num2; 
  num2=num1-num1;
  num1=num1-num2;
  System.out.prinln("\n****After Swapping*****");
  System.out.println("Number 1 :"+num1);
  System.out.println("Number 2 :"+num2);
  }
 } 
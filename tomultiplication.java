import java.util.Scanner;
class tomultiplication 
{
  public static void main(String str[])
  {
    int i,j,n,c;
	System.out.println("Enter the number to print the multiplication table ");
	for(i=1;i<=10;i++)
	{
	  System.out.println("________________________________________________");
	  for(j=1;j<=10;j++)
	  System.out.println(+i+ "*" +j+ " = "+(i*j));
	} 
	  System.out.println("Enter an integer to print it's multiplication table");
	    n = in.nextInt();
      System.out.println("Multiplication table of "+n+" is :-");
 
      for ( c = 1 ; c <= 10 ; c++ )
         System.out.println(n+"*"+c+" = "+(n*c));
	}
   }
};
import java.util.Scanner;

public class User_Authentication{
   
    public static void main(String[] args){
    	String username , password ;
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter Username :");
    	username = s.nextLine();
    	System.out.println("Enter Password :");
     	password = s.nextLine();
     	if (username.equals("admin") && password.equals("admin")) {
     		System.out.println("Authenticating Successful");
     	}else{
 
     		System.out.println("Authencating Fail !");
     	     }

   }
}
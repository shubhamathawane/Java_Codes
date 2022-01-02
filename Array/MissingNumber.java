import java.lang.reflect.Array;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int Array[];
        Array = new int[9];
        System.out.println("Please Enter elements [BETWEEN 1 TO 10] :");
        for (int i = 1; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        int n = Array.length + 1;

        int sumOfNumbers = sumOfAllNNumbers(n);

        int sumOfInputArray = sumofInputArrayNumbers(Array);

        int MissingNum = sumOfNumbers - sumOfInputArray;

        System.out.print("Missing number in an array is : " + MissingNum);
    }

    public static int sumOfAllNNumbers(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static int sumofInputArrayNumbers(int[] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        return sum;
    }
}

import java.util.*;
import java.util.Scanner;

public class MaxArrayElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + (n) + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Storing the largest number to arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[0] > arr[i]) {
                arr[0] = arr[i];
            }
        }

        System.out.println("Largest element of array is : " + arr[0]);

    }
}

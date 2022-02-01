// Finding largest and second largest element from the array 
// name : shubham maroti athawane 
// Date : 02-01-2022

import java.util.*;
import java.util.Scanner;

public class TopTwoeleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter all the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest1, largest2, temp;

        largest1 = arr[0];
        largest2 = arr[1];

        if (largest1 < largest2) {
            temp = largest1;
            largest1 = largest2;
            largest1 = temp;
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > largest1) {
                largest2 = largest1;
                largest1 = arr[i];
            } else if (arr[i] > largest2 && arr[i] != largest1) {
                largest2 = arr[i];
            }
        }

        System.out.println("The first largest is  : " + largest1);
        System.out.println("The second largest is : " + largest2);

    }
}

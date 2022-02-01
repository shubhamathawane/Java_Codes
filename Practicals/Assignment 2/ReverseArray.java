// Reversing the given array 
// name : shubham maroti athawane 
// Date : 02-01-2022

import java.util.*;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter " + (n) + " array elements : ");
        int arr[] = new int[n];
        // Taking array input 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Displaying original array
        System.out.print("Array before reverse : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Login for reversing the array 
        System.out.println();
        System.out.print("Array after revserion : ");
        for (int i = n-1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}

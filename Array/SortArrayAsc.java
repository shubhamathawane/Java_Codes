// Sorting array using selection sort Technique 
// name : shubham maroti athawane 
// Date : 02-01-2022

import java.util.*;
import java.util.Scanner;

public class SortArrayAsc {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int i, j, count, temp;

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n]; // Declaring array with n'th length

        System.out.print("Enter " + (n) + " array elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Login for selection sort algorithm

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) { // make here greater than to make it descending order array
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Displaying sorted elements in ascending order

        System.out.println("Sorted elements in Ascending order are : ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}

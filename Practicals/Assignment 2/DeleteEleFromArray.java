// Deleting given number from the array. 
// name : shubham maroti athawane 
// Date : 02-01-2022

import java.util.Scanner;

public class DeleteEleFromArray {
    public static void main(String[] args) {

        int flag = 1, loc = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter all the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to delete : ");
        int x = sc.nextInt();

        // Finding given number in array

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }

        // If number found then we will delete it

        if (flag == 1) {
            for (int i = loc + 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            System.out.println("After deleting : ");
            for (int i = 0; i < n - 2; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.print(arr[n - 2]);

            // If given number not found
        } else {
            System.out.println("Element not found! ");
        }
    }
}

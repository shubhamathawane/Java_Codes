import java.util.Scanner;

public class DuplicateEleArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        // Taking n number of array
        System.out.print("Enter " + (n) + " array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Duplicate logic here
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j] && (i != j))) {
                    System.out.println("Duplicate Elements are  : " + arr[j]);
                }
            }
        }

    }
}

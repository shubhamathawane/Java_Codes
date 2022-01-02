import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a1[] = new int[5];
        int a2[] = new int[5];
        System.out.print("Enter array 1 elements : ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Enter array 2 elements : ");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int a1len = a1.length;
        int a2len = a1.length;

        int c1 = a1len + a2len;

        int[] c = new int[c1];

        System.arraycopy(a1, 0, c, 0, a1len);
        System.arraycopy(a2, 0, c, a1len, a2len);

        System.out.println(Arrays.toString(c));

    }
};
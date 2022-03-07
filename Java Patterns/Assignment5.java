//OUTPUT
// *********
//  *******
//   *****
//    ***
//     *

public class Assignment5 {
    public static void main(String args[]) {
        int n = 5, m = 1;
        for (int i = n; i >= 1; i--) {
            // Printing Spaces
            for (int j = 1; j < m; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            m++;
            System.out.println();
        }
    }
}

// output: 
//     *
//    **
//   ***
//  ****
// *****
public class PracticalNo2 {
    public static void main(String args[]) {

        int i, j, m = 1;
        // rows
        for (i = 5; i >= 1; i--) {
            //Spacing
            for (j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            //Printing Stars
            for (int k = 1; k <= m; k++) {
                System.out.print("*");
            }
            System.out.println();
            m++;
        }
    }
}
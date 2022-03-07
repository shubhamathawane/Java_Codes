//OUTPUT
//     *
//    ***
//   *****
//  *******
// *********
public class Assignment6 {
    public static void main(String args[])
    {
        int i, k = 0, space;
        for(i =1; i<=4;++i, k=0){
            for(space = 1;space <= 4 -i; ++space)
            {
                System.out.print(" ");
            }
            while(k!=2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }
}

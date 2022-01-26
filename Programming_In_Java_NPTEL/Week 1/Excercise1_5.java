//W1 : PA 5 :-  Complete the code segment to help Ragav , 
// find the highest mark and average mark secured by him in "s" number of subjects.

import java.util.Scanner;

public class Excercise1_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        s = sc.nextInt();
        int[] arr = new int[s];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int temp = 0,j;
        for(i=0;i<s;i++)
        {
            for(j=1;j<(s-1);j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        result = arr[s-1];
        temp = 0;
        for(i=0;i<arr.length;i++)
        {
            temp += arr[i];
        }
        mark_avg = temp/s;
        System.out.println(result);
        System.out.print(mark_avg);

    }
}

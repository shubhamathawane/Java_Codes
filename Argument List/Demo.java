
public class Demo {
    static void fun(int... a) {
        System.out.println("Number of Arguments " + a.length);

        // using for each loop to display contents of a
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
            System.out.println(i + " ");
            System.out.println(sum);
        }
        System.out.println();

    }

    public static void main(String args[]) {
        // Calling the varargs method with
        // Different number of parameters
        // One parameter
        fun(100);

        // four parameters
        fun(1, 3, 4, 5, 6);
        // No Parameters
        fun();
    }
}

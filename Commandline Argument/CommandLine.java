// Practical No. 4 : 5) To display elements using command line prompt.
// Roll: CSE 2262
// Name : Shubham M. Athawane

public class CommandLine {
    public static void main(String args[]){
        System.out.println("| ================================ |");
        System.out.println("| Hello From Cammandline Argument  |");
        System.out.println("| ================================ |");

        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }

        //OR
        for(String v: args)
        {
            int a = Integer.parseInt(v);
            System.out.println(a);
        }
    }
}

import javax.xml.catalog.Catalog;

public class NestedTry {
    public static void main(String[] args) {
        try {

            int a[] = new int[10];
            System.out.print(a[12]); // Occurs Exception
            try {
                System.out.print("Division");
                int res = 100 / 0;
            } catch (ArithmeticException ex2) {
                System.out.println("Cannot divide by zero");
            }
        } catch (ArrayIndexOutOfBoundsException ex1) {
            System.out.println("ArrayIndexOutOfBoundsException Occur !");
        }

    }
}

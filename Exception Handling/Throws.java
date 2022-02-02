class ExceptoinExmple {
    void method() throws ArithmeticException {
        throw new ArithmeticException("ArithmeticException Occured !");
    }
}

public class Throws {
    public static void main(String[] args) throws ArithmeticException {
        ExceptoinExmple obj = new ExceptoinExmple();
        obj.method();

        System.out.println("End of the Program ");
    }
}

// Practical No. 5 : Static Polymorphism Example  
// Roll: CSE 2262
// Name : Shubham M. Athawane

class SimpleCalculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class StaticPoly {
    public static void main(String[] args) {
        SimpleCalculator obj = new SimpleCalculator();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}

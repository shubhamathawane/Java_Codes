// PA:03 : A) Method Overloading
// Name  : Shubham M. Athawane
// Roll  : CSE 2262

class Figure {
    void area(double length) {
        System.out.println("Area of Square is: " + Math.pow(length, 2));
    }

    // Calculate area of reactange
    void area(double length, double breadth) {
        System.out.println("Area of Reactangle is : " + (length * breadth));
    }

    // Calculate area of Cylinder
    void area(double raduis, int height) {
        System.out.println("Area of Cylinder is :" + (2 * 3.14 * Math.pow(raduis, 2) * height));
    }

    // Calculate area of cube
    void area(int arms) {
        System.out.println("Area of cube is : " + (7 * arms * arms));
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Figure fig = new Figure();
        fig.area(3.25);
        fig.area(4.5, 5.5);
        fig.area(2);
        fig.area(3.2, 6);
    }
}

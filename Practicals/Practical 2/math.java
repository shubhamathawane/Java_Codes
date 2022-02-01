// PA:02 : B) Math Class methods 
// Name  : Shubham Athawane
// Roll  : 2262

public class math {
    public static void main(String[] args) {
        double x = 20;
        double y = 4;
        double z = 27;
        double a = -56;
        double r = 34.88;

        System.out.println(Math.abs(a));
        // Return the maximum of two numbers
        System.out.println("Maximum number of x and y is : " + Math.max(x,y));
        
        System.out.println("Minimum number of x and y is : " + Math.min(x,y));

        System.out.println(Math.round(r));

        System.out.println(Math.signum(r));

        System.out.println(Math.copySign(x,y));

        // Print the next number for a towards b 
        System.out.println(Math.nextAfter(a,r));

        // Input position value, output floor value of x;
        System.out.println(Math.floor(x));

        // Return the square root y
        System.out.println("Square roo of y is : " + Math.sqrt(y));
        System.out.println("Square roo of y is : " + Math.cbrt(y));

        // returns 28 power of 4 i.e 28*28*28*28
        System.out.println("Power of x and y is : " + Math.pow(x,y));

        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is : " + Math.log10(x));
        System.out.println("log10 of y is : " + Math.log10(y));

        // return a power of 2
        System.out.println("exp of a is " + Math.exp(x));

        // return the trigonometric sine of a
        System.out.println("Sine value of a is : " + Math.sin(x));

        // return the trigonometric conine value of a
        System.out.println("Cosine value of a is : " + Math.cos(y));

    }
}

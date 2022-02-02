class abc {
    private double num = 100;

    private int square(int a) {
        return a * a;
    }
}

public class Private {
    public static void main(String[] args) {
        abc a = new abc();
        System.out.println(a.num);
        System.out.println(a.square(10));

    }
}

// Private.java:12: error: num has private access in abc      
//         System.out.println(a.num);
//                             ^
// Private.java:13: error: square(int) has private access in abc
//         System.out.println(a.square(10));
//                             ^
// 2 errors

//method overriding Example

class A {
    void x() {
        System.out.println("x Method of class a");
    }

    void y() {
        System.out.println("Y mehtod of class a");
    }

    void z() {
        System.out.println("z mehtod of class a");
        System.out.println("-------------------------------------------------");
    }

}

class B extends A {
    void x() {
        System.out.println("x Method of class b");
    }

    void y() {
        System.out.println("Y mehtod of class b");
    }

    void l() {
        System.out.println("l mehtod of class b");
        System.out.println("-------------------------------------------------");

    }
}

class C extends B {
    void x() {
        System.out.println("x Method of class c");
    }

    void y() {
        System.out.println("Y mehtod of class c");
    }

    void l() {
        System.out.println("l mehtod of class c");
        System.out.println("-------------------------------------------------");
    }
}

class TestDemo {

    public static void main(String args[]) {
        A a = new B();

        a.x();
        a.y();
        a.z();
        // a.l(); // Error

        A a2 = new C();

        a2.x();
        a2.y();
        a2.z();
        // a2.l(); //Error
        // a2.m(); // Error
    }
}

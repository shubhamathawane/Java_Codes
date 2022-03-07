interface First {
    // default method
    default void show() {
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second {
    // Default method
    default void show() {
        System.out.println("Default method implementation of Second interface.");
    }
}

// Implementation class code
class Assignment4 implements First, Second {
    // Overriding default show method
    public void show() {
        First.super.show();
        Second.super.show();
    }

    public static void main(String[] args) {
        Assignment4 as = new Assignment4();
        as.show();
    }
}

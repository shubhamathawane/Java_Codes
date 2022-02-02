class Mobiles {
    public int price;

    public void display() {
        System.out.println("This is Iphone 13 Pro max");
        System.out.println("Price : " + price);
    }
}

public class Public {
    public static void main(String[] args) {
        // Accessing the public class
        Mobiles m1 = new Mobiles();
        // Accessing the public variable
        m1.price = 1500000;
        // Accessing the public method
        m1.display();
    }
}

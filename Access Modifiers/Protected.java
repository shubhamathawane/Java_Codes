class Cars{
    protected void display(String cName)
    {
        System.out.println("The car name is " + cName);
    }
}
public class Protected {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        // Accesing Protected Method 
        c1.display("Tesla Model X");
    }
}

class Example{
    String getDetails(String name){
        return name;        
    }
}
public class Default {
    public static void main(String[] args) {
        Example e1 = new Example();
        System.out.println(e1.getDetails("Shubham"));
    }
}

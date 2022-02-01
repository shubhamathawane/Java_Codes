// Practical No. 5 : Dynamic Polymorphism Example  
// Roll: CSE 2262
// Name : Shubham M. Athawane

class ABC{
    public void myMethod(){
        System.out.println("Overridden Method");
    }
}

public class DynamicPoly extends ABC {
    public void myMethod()
    {
        System.out.println("Overridding Method");
    }
    public static void main(String[] args) {
        ABC obj = new DynamicPoly();    
        obj.myMethod();
    }
}

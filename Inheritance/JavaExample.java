class ParentClass{
    ParentClass(){
        System.out.println("Constructor of parent ");
    }

    void disp(){
        System.out.println("Parent Method");
    }
}

public class JavaExample extends ParentClass {
    JavaExample(){
        System.out.println("constructor of child ");
    }
    void disp(){
        System.out.println("Child Method ");
        super.disp();
    }

    public static void main(String[] args) {
        JavaExample obj = new JavaExample();
        obj.disp();
    }
}

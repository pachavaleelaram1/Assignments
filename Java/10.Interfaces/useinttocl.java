
// Interface
public interface MyInterface {
    void myMethod();
}

// Class implementing the interface
public class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementing myMethod");
    }

    public static void main(String[] args) {
        MyInterface obj = new MyClass();
        obj.myMethod();
    }
}

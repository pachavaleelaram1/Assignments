
// Interface with a default method
public interface MyInterface {
    default void myMethod() {
        System.out.println("Default implementation of myMethod");
    }
}

// Class implementing the interface
public class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}

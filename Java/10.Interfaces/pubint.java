```
// Public interface
public interface MyInterface {
    int id = 1;
    String name = "John Doe";

    void myMethod1();
    void myMethod2();
}

// Class implementing the interface
public class MyClass implements MyInterface {
    @Override
    public void myMethod1() {
        System.out.println("Implementing myMethod1");
    }

    @Override
    public void myMethod2() {
        System.out.println("Implementing myMethod2");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("ID: " + MyInterface.id);
        System.out.println("Name: " + MyInterface.name);
        obj.myMethod1();
        obj.myMethod2();
    }
}
```

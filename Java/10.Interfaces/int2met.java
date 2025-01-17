
// Interface
public interface MyInterface {
    void myMethod1();
    void myMethod2();
}

// Abstract class implementing the interface
public abstract class MyClass implements MyInterface {
    @Override
    public void myMethod1() {
        System.out.println("Implementing myMethod1");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass() {};
        obj.myMethod1();
    }
}

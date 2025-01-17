
// Interface 1
public interface MyInterface1 {
    void myMethod();
}

// Interface 2
public interface MyInterface2 {
    void myMethod();
}

// Class implementing both interfaces
public class MyClass implements MyInterface1, MyInterface2 {
    @Override
    public void myMethod() {
        System.out.println("Implementing myMethod");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}

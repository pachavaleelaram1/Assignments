
// Interface 1
public interface MyInterface1 {
    void myMethod1();
}

// Interface 2
public interface MyInterface2 {
    void myMethod2();
}

// Class implementing both interfaces
public class MyClass implements MyInterface1, MyInterface2 {
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
        obj.myMethod1();
        obj.myMethod2();
    }
}

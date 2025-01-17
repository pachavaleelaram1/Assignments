
public class MyClass {
    public static void staticMethod1() {
        System.out.println("Static method 1 called");
    }

    public static void staticMethod2() {
        System.out.println("Static method 2 called");
    }

    public void instanceMethod() {
        MyClass.staticMethod1();
        MyClass.staticMethod2();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.instanceMethod();
    }
}

public class MyClass {
    public void instanceMethod1() {
        System.out.println("Instance method 1 called");
    }

    public void instanceMethod2() {
        System.out.println("Instance method 2 called");
    }

    public static void staticMethod() {
        MyClass obj = new MyClass();
        obj.instanceMethod1();
        obj.instanceMethod2();
    }

    public static void main(String[] args) {
        staticMethod();
    }
}


public class MyClass {
    static int staticVar1 = 10;
    static String staticVar2 = "Hello";
    int instanceVar1;
    String instanceVar2;

    public MyClass(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    public static void staticMethod1() {
        System.out.println("Static method 1 called");
    }

    public static void staticMethod2() {
        System.out.println("Static method 2 called");
    }

    public void instanceMethod1() {
        System.out.println("Instance method 1 called");
    }

    public void instanceMethod2() {
        System.out.println("Instance method 2 called");
    }

    public static void main(String[] args) {
        System.out.println("Calling static methods:");
        MyClass.staticMethod1();
        MyClass.staticMethod2();

        MyClass obj = new MyClass(20, "World");
        System.out.println("\nCalling instance methods:");
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}

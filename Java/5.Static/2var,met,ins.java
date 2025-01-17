public class MyClass {
    // Static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Hello";

    // Instance variables
    int instanceVar1;
    String instanceVar2;

    // Constructor
    public MyClass(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    // Static methods
    public static void staticMethod1() {
        System.out.println("This is static method 1");
    }

    public static void staticMethod2() {
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("This is instance method 1");
    }

    public void instanceMethod2() {
        System.out.println("Instance variable 1: " + instanceVar1);
        System.out.println("Instance variable 2: " + instanceVar2);
    }

    // Main method
    public static void main(String[] args) {
        // Accessing static variables and methods
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);
        staticMethod1();
        staticMethod2();

        // Creating an instance of the class
        MyClass obj = new MyClass(20, "World");

        // Accessing instance variables and methods
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}

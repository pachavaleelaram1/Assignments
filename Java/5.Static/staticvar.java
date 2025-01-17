public class MyClass {
    static int staticVar1 = 10;
    static String staticVar2 = "Hello";

    public void instanceMethod1() {
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);
    }

    public void instanceMethod2() {
        System.out.println("Accessing static variables from instance method 2");
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}


public class MyClass {
    static int staticVar1 = 10;
    static String staticVar2 = "Hello";
    int instanceVar1;
    String instanceVar2;

    public MyClass(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    public static void main(String[] args) {
        System.out.println("Static variables:");
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);

        MyClass obj = new MyClass(20, "World");
        System.out.println("\nInstance variables:");
        System.out.println("instanceVar1: " + obj.instanceVar1);
        System.out.println("instanceVar2: " + obj.instanceVar2);
    }
}

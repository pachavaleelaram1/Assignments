
public class MyClass {
    int instanceVar1;
    String instanceVar2;

    public MyClass(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    public static void staticMethod1(MyClass obj) {
        System.out.println("Instance variable 1: " + obj.instanceVar1);
        System.out.println("Instance variable 2: " + obj.instanceVar2);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(20, "World");
        staticMethod1(obj);
    }
}


// ClassA.java
class ClassA {
    int id = 1;
    String name = "John Doe";

    void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// ClassB.java
public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("ID: " + obj.id);
        System.out.println("Name: " + obj.name);
        obj.printDetails();
    }
}

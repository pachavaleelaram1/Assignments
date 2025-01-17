
// Interface with public fields
public interface MyInterface {
    int id = 1; // public by default
    String name = "John Doe"; // public by default
}

// Class implementing the interface
public class MyClass implements MyInterface {
    public static void main(String[] args) {
        System.out.println("ID: " + MyInterface.id);
        System.out.println("Name: " + MyInterface.name);
    }
}


// Abstract class
public abstract class AbstractClass {
    // Abstract method
    public abstract void abstractMethod();

    // Non-abstract method
    public void nonAbstractMethod() {
        System.out.println("This is a non-abstract method");
    }

    // Another non-abstract method
    public void anotherNonAbstractMethod() {
        System.out.println("This is another non-abstract method");
    }
}

// Child class
public class ChildClass extends AbstractClass {
    // Implementing the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Implementing the abstract method");
    }

    public static void main(String[] args) {
        // Creating an instance of the child class
        ChildClass childObj = new ChildClass();
        childObj.nonAbstractMethod();
        childObj.anotherNonAbstractMethod();
    }
}

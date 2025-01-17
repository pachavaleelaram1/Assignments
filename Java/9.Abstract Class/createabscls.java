
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

// Concrete class that extends the abstract class
class ConcreteClass extends AbstractClass {
    // Implementing the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Implementing the abstract method");
    }

    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.abstractMethod();
        obj.nonAbstractMethod();
        obj.anotherNonAbstractMethod();
    }
}

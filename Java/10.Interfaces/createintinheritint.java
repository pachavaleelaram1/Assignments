
// Parent interface
public interface ParentInterface {
    void parentMethod();
}

// Child interface inheriting from ParentInterface
public interface ChildInterface extends ParentInterface {
    void childMethod();
}

// Class implementing the ChildInterface
public class MyClass implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Implementing parentMethod");
    }

    @Override
    public void childMethod() {
        System.out.println("Implementing childMethod");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.parentMethod();
        obj.childMethod();
    }
}

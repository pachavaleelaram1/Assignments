class Parent {
    private int id;
    private String name;

    private Parent() {
        this.id = 1;
        this.name = "John Doe";
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println("ID: " + obj.id);
        System.out.println("Name: " + obj.name);
        obj.privateMethod();
    }
}

class Child extends Parent {
    public void accessParentMembers() {
        // The following lines will result in compile-time errors
        // System.out.println("ID: " + id);
        // System.out.println("Name: " + name);
        // privateMethod();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.accessParentMembers();
    }
}

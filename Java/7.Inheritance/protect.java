
// Package1/ClassA.java
package Package1;

class ClassA {
    protected int id = 1;
    protected String name = "John Doe";

    protected void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Package1/ClassB.java
package Package1;

public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("ID: " + obj.id);
        System.out.println("Name: " + obj.name);
        obj.printDetails();
    }
}

// Package2/ClassC.java
package Package2;

import Package1.ClassA;

public class ClassC extends ClassA {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        System.out.println("ID: " + obj.id);
        System.out.println("Name: " + obj.name);
        obj.printDetails();
    }
}

// Package2/ClassD.java
package Package2;

import Package1.ClassA;

public class ClassD {
    public static void main(String[] args) {
        // This will result in compile-time error
        // ClassA obj = new ClassA();
        // System.out.println("ID: " + obj.id);
        // System.out.println("Name: " + obj.name);
        // obj.printDetails();
    }
}

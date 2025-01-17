
// Package1/ClassA.java
package Package1;

public class ClassA {
    public int id = 1;
    public String name = "John Doe";

    public void printDetails() {
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

public class ClassC {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("ID: " + obj.id);
        System.out.println("Name: " + obj.name);
        obj.printDetails();
    }
}

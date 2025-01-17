class A {
    int a = 10;

    void methodA1() {
        System.out.println("Method A1");
    }

    void methodA2() {
        System.out.println("Method A2");
    }

    void overrideMethod() {
        System.out.println("Override method in A");
    }
}

class B extends A {
    int b = 20;

    void methodB1() {
        System.out.println("Method B1");
    }

    void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override method in B");
    }
}

class C extends B {
    int c = 30;

    void methodC1() {
        System.out.println("Method C1");
    }

    void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override method in C");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Class A:");
        a.methodA1();
        a.methodA2();
        a.overrideMethod();
        System.out.println("Value of a: " + a.a);

        System.out.println("\nClass B:");
        b.methodA1();
        b.methodA2();
        b.methodB1();
        b.methodB2();
        b.overrideMethod();
        System.out.println("Value of a: " + b.a);
        System.out.println("Value of b: " + b.b);

        System.out.println("\nClass C:");
        c.methodA1();
        c.methodA2();
        c.methodB1();
        c.methodB2();
        c.methodC1();
        c.methodC2();
        c.overrideMethod();
        System.out.println("Value of a: " + c.a);
        System.out.println("Value of b: " + c.b);
        System.out.println("Value of c: " + c.c);

        System.out.println("\nRuntime Polymorphism:");
        A ab = new B();
        A ac = new C();
        ab.overrideMethod();
        ac.overrideMethod();
    }
}

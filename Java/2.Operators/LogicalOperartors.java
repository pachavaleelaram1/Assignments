//*Logical AND Operator (&&)*


public class LogicalAND {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("a && b = " + result);

        a = true;
        b = true;
        result = a && b;
        System.out.println("a && b = " + result);
    }
}


//*Logical OR Operator (||)*


public class LogicalOR {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a || b;
        System.out.println("a || b = " + result);

        a = false;
        b = false;
        result = a || b;
        System.out.println("a || b = " + result);
    }
}


//Logical NOT Operator (!)

public class LogicalNOT {
    public static void main(String[] args) {
        boolean a = true;

        boolean result = !a;
        System.out.println("!a = " + result);

        a = false;
        result = !a;
        System.out.println("!a = " + result);
    }
}


public class EqualityOperators {
    public static void equalityOperations(int num1, int num2) {
        // Equal Operator (==)
        boolean isEqual = num1 == num2;
        System.out.println(num1 + " is equal to " + num2 + ": " + isEqual);

        // Not Equal Operator (!=)
        boolean isNotEqual = num1 != num2;
        System.out.println(num1 + " is not equal to " + num2 + ": " + isNotEqual);
    }

    public static void main(String[] args) {
        equalityOperations(10, 10); // Equal
        equalityOperations(10, 20); // Not Equal
    }
}

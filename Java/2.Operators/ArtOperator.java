public class ArtOperator {
    public static void arithmeticOperations(int num1, int num2) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }

    public static void main(String[] args) {
        arithmeticOperations(10, 2);
    }
}

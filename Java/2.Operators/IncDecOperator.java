public class IncDecOperators {
    public static void incrementDecrementOperations(int num) {
        System.out.println("Original Number: " + num);

        // Post-Increment
        int postIncrement = num++;
        System.out.println("Post-Increment: " + postIncrement);
        System.out.println("Number after Post-Increment: " + num);

        // Pre-Increment
        int preIncrement = ++num;
        System.out.println("Pre-Increment: " + preIncrement);
        System.out.println("Number after Pre-Increment: " + num);

        // Post-Decrement
        int postDecrement = num--;
        System.out.println("Post-Decrement: " + postDecrement);
        System.out.println("Number after Post-Decrement: " + num);

        // Pre-Decrement
        int preDecrement = --num;
        System.out.println("Pre-Decrement: " + preDecrement);
        System.out.println("Number after Pre-Decrement: " + num);
    }

    public static void main(String[] args) {
        incrementDecrementOperations(10);
    }
}

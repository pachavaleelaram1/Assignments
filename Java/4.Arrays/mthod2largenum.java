import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];
        System.out.println("Second largest number: " + secondLargest);
    }
}

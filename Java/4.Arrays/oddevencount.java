
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 23, 44, 57, 92};
        int[] result = countEvenOdd(array);
        System.out.println("Number of even numbers: " + result[0]);
        System.out.println("Number of odd numbers: " + result[1]);
    }

    public static int[] countEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[] {evenCount, oddCount};
    }
}

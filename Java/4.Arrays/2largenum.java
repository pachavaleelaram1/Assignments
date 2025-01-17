
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int secondLargest = findSecondLargest(array);
        if (secondLargest != -1) {
            System.out.println("Second largest number: " + secondLargest);
        } else {
            System.out.println("No second largest number found");
        }
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }
        return secondMax;
    }
}

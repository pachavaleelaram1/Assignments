
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int difference = largestSmallestDifference(array);
        System.out.println("Difference between largest and smallest value: " + difference);
    }

    public static int largestSmallestDifference(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }
}


public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int[] result = findMinAndMax(array);
        System.out.println("Minimum value: " + result[0]);
        System.out.println("Maximum value: " + result[1]);
    }

    public static int[] findMinAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        return new int[] {min, max};
    }
}

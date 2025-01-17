
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 20, 40, 50, 30};
        array = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(array));
    }

    public static int[] removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            boolean duplicate = false;
            for (int k = 0; k < j; k++) {
                if (temp[k] == array[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[j] = array[i];
                j++;
            }
        }
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }
}

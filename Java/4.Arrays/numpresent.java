public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        if (contains(array, target)) {
            System.out.println("Array contains " + target);
        } else {
            System.out.println("Array does not contain " + target);
        }
    }

    public static boolean contains(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}

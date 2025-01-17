public class Main {
    public static void main(String[] args) {
        int[] array = {10, 12, 20, 23, 30};
        boolean result = containsElements(array, 12, 23);
        System.out.println("Array contains 12 and 23: " + result);
    }

    public static boolean containsElements(int[] array, int element1, int element2) {
        boolean found1 = false;
        boolean found2 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element1) {
                found1 = true;
            } else if (array[i] == element2) {
                found2 = true;
            }
            if (found1 && found2) {
                break;
            }
        }
        return found1 && found2;
    }
}

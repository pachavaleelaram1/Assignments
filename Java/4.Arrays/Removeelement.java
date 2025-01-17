public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        array = removeElement(array, target);
        System.out.println("Array after removing " + target);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] removeElement(int[] array, int target) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int element = 25;
        int position = 2;
        array = insertElement(array, element, position);
        System.out.println("Array after inserting " + element + " at position " + position);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = element;
        for (int i = position + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }
}

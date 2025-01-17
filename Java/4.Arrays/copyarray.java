public class Main {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int[] copiedArray = copyArray(originalArray);
        System.out.println("Original Array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println("\nCopied Array: ");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }

    public static int[] copyArray(int[] originalArray) {
        int[] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        return copiedArray;
    }
}

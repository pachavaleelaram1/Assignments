public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        int index1 = str.indexOf("World");  // Returns the index of "World"
        int index2 = str.indexOf("Universe"); // Returns -1 if not found
        System.out.println("Index of 'World': " + index1);
        System.out.println("Index of 'Universe': " + index2);
    }
}

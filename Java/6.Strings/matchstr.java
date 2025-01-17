
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "123 Main St";

        System.out.println(str1.matches("Hello.*"));  // Returns true
        System.out.println(str2.matches("\\d+.*"));  // Returns true
        System.out.println(str1.matches("Goodbye.*"));  // Returns false
    }
}

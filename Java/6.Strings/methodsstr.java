
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello World";
        String str4 = "World";

        System.out.println(str1.equalsIgnoreCase(str2));  // Returns true
        System.out.println(str3.startsWith("Hello"));  // Returns true
        System.out.println(str3.endsWith("World"));  // Returns true
        System.out.println(str1.compareTo(str2));  // Returns 0 (case-sensitive)
        System.out.println(str1.compareToIgnoreCase(str2));  // Returns 0 (case-insensitive)
    }
}


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int remainder = num % 2;
        switch (remainder) {
            case 0:
                System.out.println(num + " is even");
                break;
            case 1:
                System.out.println(num + " is odd");
                break;
        }
        scanner.close();
    }
}

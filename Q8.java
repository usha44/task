//8. Write a method to swap two numbers without using a temporary variable
import java.util.Scanner;
public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: a = " + a + ", b = " + b);


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}



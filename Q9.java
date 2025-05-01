//9. Create a method to find the sum of the first n natural numbers
import java.util.Scanner;

public class Q9 {
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = findSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }

        sc.close();
    }
}

    

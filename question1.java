//1 Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;

public class question1 {
    
    public static boolean isEven(int n) {
        return n % 2 == 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        sc.close();
    }
}
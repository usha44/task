//14. Write a method that returns the sum of squares of digits of a number
import java.util.Scanner;

public class Q14 {

    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;  
            sum += digit * digit;     
            number /= 10;             
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumOfSquaresOfDigits(num);
        System.out.println("Sum of squares of digits of " + num + " is: " + result);

        sc.close();
    }
}


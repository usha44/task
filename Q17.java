//17. Create a method to reverse an integer number without converting it to a string
import java.util.Scanner;
public class Q17 {

    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit;  
            number /= 10;  
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int reversedNum = reverseNumber(num);
        System.out.println("Reversed number: " + reversedNum);

        sc.close();
    }
}


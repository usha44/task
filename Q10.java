//10. Write a method to print all factors of a number
import java.util.Scanner;
public class Q10 {
   
    public static void printFactors(int number) {
        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter a positive integer.");
        } else {
            printFactors(num);
        }

        sc.close();
    }
}


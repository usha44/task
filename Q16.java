//16. Write a method to check if a number is a Kaprekar number
import java.util.Scanner;
public class Q16 {
    public static boolean isKaprekarNumber(int number) {
      
        int square = number * number;
  
        String squareStr = String.valueOf(square);
        int length = squareStr.length();
        

        String leftStr = squareStr.substring(0, length / 2);
        String rightStr = squareStr.substring(length / 2);
    
        int left = leftStr.isEmpty() ? 0 : Integer.parseInt(leftStr);
        int right = rightStr.isEmpty() ? 0 : Integer.parseInt(rightStr);
        
        return (left + right) == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isKaprekarNumber(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is NOT a Kaprekar number.");
        }

        sc.close();
    }
}


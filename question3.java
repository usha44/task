//3. Write a method to determine whether a number is a Harshad number or not
import java.util.Scanner;
public class question3 {
        public static boolean isHarshadNumber(int number) {
            int originalNumber = number;
            int sum = 0;
    
          
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum == 0) return false;
    
            return (originalNumber % sum == 0);
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            sc.close();
    
            if (isHarshadNumber(number)) {
                System.out.println(number + " is a Harshad number.");
            } else {
                System.out.println(number + " is not a Harshad number.");
            }
        }
    }
    

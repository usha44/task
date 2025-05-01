//6. Create a method to check whether a given number is a palindrome prime
    import java.util.Scanner;
    public class question6 {
        public static boolean isPalindrome(int number) {
            int original = number;
            int reversed = 0;
    
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
    
            return original == reversed;
        }
        public static boolean isPrime(int number) {
            if (number <= 1) return false;
    
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
    
            return true;
        }
        public static boolean isPalindromePrime(int number) {
            return isPalindrome(number) && isPrime(number);
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
    
            if (isPalindromePrime(number)) {
                System.out.println(number + " is a Palindrome Prime.");
            } else {
                System.out.println(number + " is NOT a Palindrome Prime.");
            }
    
            sc.close();
        }
    }
    


//15. Create a method to count uppercase and lowercase characters in a string
import java.util.Scanner;
public class Q15 {
    public static void countUppercaseAndLowercase(String str) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
  
            else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        System.out.println("Uppercase characters: " + uppercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        countUppercaseAndLowercase(input);

        sc.close();
    }
}



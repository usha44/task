//12. Write a method to determine if a number is a Duck number
 import java.util.Scanner;
 public class Q12 {
 
     public static boolean isDuckNumber(int number) {
         String numStr = String.valueOf(number);
         if (numStr.charAt(0) == '0') {
             return false;
         }
         return numStr.contains("0");
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
 
         if (isDuckNumber(num)) {
             System.out.println(num + " is a Duck Number.");
         } else {
             System.out.println(num + " is NOT a Duck Number.");
         }
 
         sc.close();
     }
 }
 

    

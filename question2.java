//2 Create a method to convert a given number of days into years, months, and days

import java.util.Scanner;

public class question2 {
    public static void main(int totalDays) {
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(totalDays + " days is approximately: ");
        System.out.println(years + " years, " + months + " months, and " + days + " days.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();
        sc.close();

        main(totalDays);
    }
}

    

//5. Write a method to calculate the compound interest given principal, rate, and time

import java.util.Scanner;

public class question5 {
    public static double calculate(double principal, double rate, double time) {
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount - principal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        double interest = calculate(principal, rate, time);
        System.out.println("Compound Interest: " + interest);
        sc.close();
    }
}
    


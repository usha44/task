//11. Create a method to calculate the cube of a given number
import java.util.Scanner;
public class Q11 {

    public static int calculateCube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int cube = calculateCube(num);
        System.out.println("The cube of " + num + " is: " + cube);

        sc.close();
    }
}


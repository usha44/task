//19. Create a method that accepts a character and returns its ASCII value
    import java.util.Scanner;

public class Q19 {
    public static int getASCIIValue(char character) {
        return (int) character;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);  

        int asciiValue = getASCIIValue(inputChar);
        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

        sc.close();
    }
}


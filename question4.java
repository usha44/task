// 4. Write a method to count the number of words in a given string
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println("Number of words: " + count);
        sc.close();
    }
}


    


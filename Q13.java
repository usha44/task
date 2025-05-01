//13. Create a method to print the multiplication tables from 1 to 10
public class Q13 {
        public static void printMultiplicationTables() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Multiplication Table for " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();  
            }
        }
        public static void main(String[] args) {
            printMultiplicationTables();
        }
    }
    

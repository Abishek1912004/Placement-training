
package javaapplication3;
import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        printZigzagPattern(input);

        scanner.close();
    }

    

    static void printZigzagPattern(String input) {
        char[] charArray = input.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || j == length - 1 || i == 0) {
                    System.out.print(charArray[j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            for (int k = 0; k <= i; k++) {
                System.out.print("    ");
            }
        }
    }
}



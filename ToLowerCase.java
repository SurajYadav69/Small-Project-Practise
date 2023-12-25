package REVISION;
import java.util.Scanner;

public class ToLowercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("To Lower The User Input\nEnter the input:- ");
        String original = scanner.nextLine();
        String result = ToLowercase(original); // Call the method with correct capitalization

        System.out.println("Original: " + original);
        System.out.println("Lowercase: " + result);

        scanner.close();
    }

    private static String ToLowercase(String input) { // Method name corrected
        return input.toLowerCase();
    }
}

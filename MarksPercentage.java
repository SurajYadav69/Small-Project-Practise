
import java.util.Scanner;

    public class CalculatePercentage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the five subject marks here:- ");

            System.out.print("English :- ");
            double english = scanner.nextDouble();

            System.out.print("Hindi :- ");
            double hindi = scanner.nextDouble();

            System.out.print("Marathi :- ");
            double marathi = scanner.nextDouble();

            System.out.print("Maths :- ");
            double maths = scanner.nextDouble();

            System.out.print("Science :- ");
            double science = scanner.nextDouble();

            // Calculate total marks
            double totalMarks = english + hindi + marathi + maths + science;

            // Calculate percentage
            double percentage = totalMarks / 500 * 100;

            // Display result
            System.out.println("Total Marks:- " + totalMarks);
            System.out.println("Percentage:- " + percentage);

            if (percentage < 40) {
                System.out.println("Sorry, you have failed the exam!");
            } else {
                System.out.println("Congratulations! You have passed the exam!");
            }
        }
    }

}

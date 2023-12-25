package REVISION;
import java.util.Scanner;

public class ReplaceFromSentence {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("REPLACE WORD FROM A SENTENCE\n Enter The Sentece:- ");
            String sentence = scanner.nextLine();

            System.out.println("Your Target Word Is:- ");
            String target = scanner.nextLine(); 

            System.out.println("Your Desire Word Is:- ");
            String desire = scanner.nextLine();

            String newsentence = replaceWord(sentence, target, desire);

            System.out.println("Original: " + sentence);
            System.out.println("Updated: " + newsentence);

            scanner.close();
        }

        private static String replaceWord(String sentence, String target, String desire) {
            return sentence.replaceAll("\\b" + target +"\\b", desire).toLowerCase();
        }
    }


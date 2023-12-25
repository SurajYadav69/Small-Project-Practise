package REVISION;
import java.util.Scanner;


public class WebsiteTypeDetector {
    public static void main(String[] args) {
        System.out.println("WEBSITE TYPE DETECTOR");
        System.out.println("Enter the URL:- ");


        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        String type = websitetype(url);

        System.out.println(type);
    }

    private static String websitetype(String url) {
        if (url.endsWith(".com")){
            return "Commercial Website";
        }
        else if (url.endsWith(".in")) {
            return "Indian Website";
        }
        else if (url.endsWith(".org")) {
            return "organizational Website";
        }

        else {
            return "Invalid Input (Error)";
        }
    }

}

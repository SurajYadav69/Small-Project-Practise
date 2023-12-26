package REVISION;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        System.out.println("For which number table you want to print");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Multiplication Table For" + n + ":- ");


        for (int i = 1; i <= 10; i++){
            System.out.println("12 * " + i + " = " + (n*i));        }
    }
}

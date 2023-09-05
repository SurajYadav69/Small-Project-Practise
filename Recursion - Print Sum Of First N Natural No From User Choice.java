package DSA.Recursion;
import java.util.Scanner;

public class PrintSumOfFirstN_NaturalNumber {
    public static int print(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return sum;
        }
        sum += i;
        return print(i + 1, n, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number:");
        int n = sc.nextInt();

        int sum = print(1, n, 0);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

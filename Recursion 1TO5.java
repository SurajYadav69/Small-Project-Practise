package DSA.Recursion;
import java.util.Scanner;

public class PrintNo1To5 {
    public static void print(int n){
        if (n == 6){
            return; // Removed the invalid return statement
        }
        System.out.println(n);
        print(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        if (n == 6) {
            return; // Removed the invalid return statement
        }
        System.out.println(n);
        print(n++);
    }
}

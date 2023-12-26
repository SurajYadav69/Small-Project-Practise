package REVISION;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("First n odd number using a for loop");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i<=2*n; i+=2){
            System.out.println(i);
        }
    }
}

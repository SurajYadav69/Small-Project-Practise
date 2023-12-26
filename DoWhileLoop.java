package REVISION;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Print First N Natural Number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 20;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}

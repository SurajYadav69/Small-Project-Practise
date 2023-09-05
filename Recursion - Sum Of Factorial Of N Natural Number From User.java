package DSA.Recursion;

import java.util.Scanner;

public class RecursionOf_N_Factorial {
    public static int Sumfac(int n) {
        if(n==1 || n==0){
            return 1;
        }
        int fac_1 = Sumfac(n-1);
        int fac_2 = n*fac_1;
        return fac_2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();
        int ans = Sumfac(n);
        System.out.println("Sum Of Factorial NAtural No Is :- "+ans);

    }
}

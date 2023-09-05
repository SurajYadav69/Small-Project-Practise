package DSA.Recursion;

public class PrintFibonacciSeriesSum {
    public static void Sumfib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        Sumfib(b,c,n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        Sumfib(a, b, n-2);
    }
}

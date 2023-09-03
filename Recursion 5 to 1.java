package DSA.Recursion;
// its a recursion program where the number decreases by 5 to 1 by using call of recursion.
public class Recursion5To1 {

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}

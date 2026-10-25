 import java.util.*;
public class FibonaciByRecurssion {
    static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of terms: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println((i) + " ");
        }
    }
}

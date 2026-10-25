import java.util.*;
public class factorial
{
    static int factorial(int n) {
        int factorial = 1;
        for(int i = 1; i<=n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("factorial = " + factorial(n));
    }
}



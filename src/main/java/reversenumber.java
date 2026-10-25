import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        for(int i = 1; i<=n; i++) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
            System.out.println("reverse = " +reverse);
        }
    }
}
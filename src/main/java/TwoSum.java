import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target:");
        int Target = sc.nextInt();
        for(int i = 0; i<=n; i++) {
            for(int j = i+1; j<=n; j++) {
                if(arr[i] + arr[j] == Target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("no pair found");
    }
}

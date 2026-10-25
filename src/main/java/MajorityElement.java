public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2, 6, 9, 2, 5,2,2};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                System.out.println(" Majority Element: " + arr[i]);
                return;
            }
            System.out.println(" no Majority Element found ");
        }
    }
}
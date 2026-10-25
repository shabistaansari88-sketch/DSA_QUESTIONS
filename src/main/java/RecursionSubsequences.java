import java.util.*;
public class RecursionSubsequences {
    static void printSubsequences(String str, int index, String result) {
        // base condition
        if (index == str.length()) {
            System.out.println(result);
            return;
        }
        // include character
        printSubsequences(str, index + 1, result + str.charAt(index));

        //exclude character
        printSubsequences(str, index + 1, result);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}

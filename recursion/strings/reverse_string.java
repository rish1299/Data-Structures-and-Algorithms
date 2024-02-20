package strings;

import java.util.Scanner;

public class reverse_string {

    // Method 1
    // static String reverse(String s, int idx) {
    // if (idx == s.length())
    // return "";

    // String smallAns = reverse(s, idx + 1);

    // return smallAns + s.charAt(idx);
    // }

    // Method 2
    static String reverseA2(String s) {
        if (s.length() == 0)
            return "";

        String smallAns = reverseA2(s.substring(1));

        return smallAns + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverseA2(s);

        // Method for palindrome
        if (rev.equals(s)) {
            System.out.printf("%s is Plaindrome ", s);
        } else {
            System.out.printf("%s Not Plaindrome ", s);
        }
    }

}

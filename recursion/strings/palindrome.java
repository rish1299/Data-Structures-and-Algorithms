package strings;

import java.util.Scanner;

public class palindrome {

    // Methdo 1

    // static String reverse(String s) {
    // if (s.length() == 0)
    // return "";

    // String smallAns = reverse(s.substring(1));

    // return smallAns + s.charAt(0);
    // }


        //Method 2
    static boolean isPalindrome(String s, int l, int r) {

        // base case
        if (l >= r) {
            return true;
        }

        // self work
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s, 0, s.length() - 1));

        // Method 1 for palindrome
        // String rev = reverse(s);
        // if (rev.equals(s)) {
        // System.out.printf("%s is Plaindrome ", s);
        // } else {
        // System.out.printf("%s Not Plaindrome ", s);
        // }

    }

}

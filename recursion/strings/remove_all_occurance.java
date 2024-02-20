package strings;

import java.util.Scanner;

public class remove_all_occurance {
    // remove all the occurances of "a" from string s="abcax"
    // ans = bcx

    // Method 1

    // static String removeAllOcuurances(String s, int idx) {
    // // base case
    // if (idx == s.length())
    // return "";

    // // recursive work
    // String smallAns = removeAllOcuurances(s, idx + 1);
    // char currChar = s.charAt(idx);

    // // self work
    // if (currChar != 'a') {
    // return currChar + smallAns;
    // } else {
    // return smallAns;
    // }

    // }

    // Method 2

    static String removeA2(String s) {
        // base case
        if (s.length() == 0)
            return "";

        String smallAns = removeA2(s.substring(1));

        char currChar = s.charAt(0);

        // self work
        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA2(s));
    }


   
}

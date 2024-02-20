package strings;

import java.util.Scanner;

public class basic_strings {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next(); // space is end of line or delimitor

        // String s = sc.nextLine(); // End of line is the de limitor
        // System.out.println(s);

        // #2

        // char ch = s.charAt(0);
        // System.out.println(ch);

        // for(int i=0; i < s.length(); i++){
        // System.out.println(s.charAt(i));
        // }

        // #3 sub-string
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 2 se 4 but 4 is exclusive
        System.out.println(s.substring(2, 4));

    }

}

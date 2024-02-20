package strings;

import java.util.Scanner;

public class integer_alindrome {

    static boolean isPalindrome(int number) {

        int anotherNum = 0, copyNum, rem;
        copyNum = number;

        while (number > 0) {
            rem = number % 10;
            anotherNum = (anotherNum * 10) + rem;
            number = number / 10;
        }

        if (copyNum == anotherNum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(isPalindrome(number));

    }

}

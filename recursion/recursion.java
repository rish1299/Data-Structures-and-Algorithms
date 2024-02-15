import java.util.Scanner;

public class recursion {

    // static void printIncreasing(int n) {
    // if(n == 1){
    // System.out.println(n);
    // return;
    // }

    // printIncreasing(n-1); //1, 2, .... n-1,n
    // System.out.println(n);
    // }

    static void printDecreasing(int n) {

        if (n == 1) { // base case
            System.out.println(1);
            return;
        }

        System.out.println(n); // self work
        printDecreasing(n - 1); // n, n-1, ...... 1 //sub-problem

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        // printIncreasing(n);
        printDecreasing(n);
    }

}

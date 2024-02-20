package Array;

public class isSorted {

    static boolean isSortedArrayRecursion(int[] a, int idx) {
        // base case
        if (idx >= a.length - 1) {
            return true;
        }

        // self work
        if (a[idx] > a[idx + 1]) {
            return false;
        }

        // recrsion work
        return isSortedArrayRecursion(a, idx + 1);

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 4 };

        System.out.println(isSortedArrayRecursion(a, 0));
    }

}

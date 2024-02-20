package Array;

public class last_Index {

    static int lastIndex(int[] a, int target, int idx) {
        // base case
        if (idx < 0) {
            return -1;
        }

        // self work
        if (a[idx] == target) {
            return idx;
        }

        // recursion work
        return lastIndex(a, target, idx - 1);

    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 4 };

        int target = 4;
        System.out.println(lastIndex(a, target, a.length - 1));

    }
}

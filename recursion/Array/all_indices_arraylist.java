package Array;
import java.util.ArrayList;

public class all_indices_arraylist {

    static ArrayList<Integer> findIndices(int[] a, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return new ArrayList<Integer>();
        }

        // self work
        ArrayList<Integer> ans = new ArrayList<>();
        if (a[idx] == target) {
            ans.add(idx);
        }

        // recursive work
        ArrayList<Integer> smallAns = findIndices(a, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 4, 4, 6, 4 };
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans = findIndices(a, n, target, 0);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }

}

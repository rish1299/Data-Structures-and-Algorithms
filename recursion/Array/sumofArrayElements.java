package Array;

public class sumofArrayElements {

    static int sum(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int smallAns = sum(arr, idx + 1);
        return    arr[idx] + smallAns ;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 20, 1 };
        System.out.println(sum(arr, 0));
        // System.out.println("hi");

    }
}

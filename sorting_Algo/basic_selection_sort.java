package sorting_Algo;

public class basic_selection_sort {

    static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {// i represents the current index

            // Find the minimum element in unsorted part of array
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }

            }
            // swap current element and minimum element -> current index i will have correct
            // element
            // a[minIdx] and a[i]
            if (minIdx != i) {
                int temp = a[i];
                a[i] = a[minIdx];
                a[minIdx] = temp;
            }

        }

    }

    public static void main(String[] args) {
        int[] a = { 5, 4, 3, 2, 9 };
        selectionSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}

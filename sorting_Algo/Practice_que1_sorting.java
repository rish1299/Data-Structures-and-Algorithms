package sorting_Algo;
// Move Zeros 

//Given an array arr, move all the 0's to the end of the of it while maintaining the relative order of the non-zeros elements
// input - 0 0 5 3 4
// output- 5 3 4 0 0 

public class Practice_que1_sorting {

    static void zeroSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // last i elements are already in correctly placed
            boolean flag=false;
            for (int j = 0; j < n - i - 1; j++) {
               
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    // swap
                    flag= true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag==false) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 10, 5, 0, 4 };

        zeroSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

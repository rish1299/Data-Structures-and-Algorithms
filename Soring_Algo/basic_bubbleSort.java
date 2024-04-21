package Soring_Algo;

public class basic_bubbleSort {

    static void bubbleSort(int[] a) {
        int n = a.length;

        // n-1 iterations
        for (int i = 0; i < n - 1; i++) {
            @SuppressWarnings("unused")
            boolean flag = false; //has any swapping happned

            for (int j = 0; j < n - i - 1; j++) {
                // last i elements are already at correct sorted positions
                // so no need to check it
                if (a[j] > a[j + 1]) {
                    // swap - a[j],a[j+1]
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if(flag = false){ //have any swaps happened??
                return;    //Agar swaaping nahi hui to return krwao
            }
        }
        
    }

    public static void main(String[] args) {
        int [] a = {7, 6, 5, 4, 3, 1};
        bubbleSort(a);
        
        for (int i : a) {
            System.out.print(i + " ");
        }
      
    }
}

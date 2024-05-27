package sorting_Algo;

public class ProblemsOnAlgoPt2_que3 {
    //Sort the array in acending order containing only 0, 1, 2 [in linear time or 1 pass]
    static void swap(int[] arr, int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int[] a){
        int low=0, mid=0, high=a.length-1;

        while(mid <= high){
            if (a[mid] == 0){
                swap(a, mid, low);
                low++;
                mid++;
            } else if (a[mid] == 1){
                mid++;
            } else if (a[mid] == 2){
                swap(a, mid, high);
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int[] num = {2, 2, 0, 0, 1, 1, 2, 0, 1, 0};
        sort012(num);
        for (int i : num) {
            System.out.print(i +" ");
        }
    }
}

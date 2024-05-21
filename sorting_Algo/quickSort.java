package sorting_Algo;

public class quickSort {

    static void displayArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt=0;

        for (int i = st+1; i <= end; i++) {
            if(arr[i] <= pivot ) cnt++;  // duplicate element in left 
        }
        int pivotIndex = st+cnt;
        swap(arr, st,pivotIndex);
        int i =st, j =end;
        //elements lesser left, greater right side of piviot
        while (i < pivotIndex && j > pivotIndex) {
           while (arr[i] <= pivot) i++;
           while (arr[j] > pivot) j--;

           if(i < pivotIndex && j > pivotIndex){
            swap(arr, i, j);
            i++;
            j--;
           }
        }



        return pivotIndex;
    }

    static void quickSort(int[]arr, int st, int end){
        if(st>=end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }




    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting");
        displayArr(arr);

    }
    
}








//---------------------------------------------------------------------------------------------------------------
// for list

// import java.util.* ;
// import java.io.*; 
// public class Solution {


//     static int partition(List<Integer>arr, int st, int end){
//         int pivot = arr.get(st);
//         int cnt=0;

//         for(int i=st+1; i<=end; i++){
//             if(arr.get(i) <= pivot) cnt++;
//         }

//         int pivotIndex = st+cnt;
//         Collections.swap(arr, st, pivotIndex);
//         int i=st, j=end;
//         while(i < pivotIndex && j > pivotIndex){
//             while(arr.get(i) <= pivot) i++;
//             while(arr.get(j)> pivot) j--;
//             if(i < pivotIndex && j > pivotIndex){
//                Collections.swap(arr, i, j);
//                 i++;
//                 j--;
//             }
//         }

//     return pivotIndex;
//     }

//     static void qSort(List<Integer> arr, int st,int end){
//         if(st >= end) return;

//         int pi = partition(arr, st, end);
//         qSort(arr, st, pi-1);
//         qSort(arr, pi+1, end);
//     }

//     public static List<Integer> quickSort(List<Integer> arr){
//         // Write your code here.
//         qSort(arr, 0, arr.size()-1);
//         return arr;
//     }
// }
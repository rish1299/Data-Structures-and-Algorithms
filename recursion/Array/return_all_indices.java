package Array;
public class return_all_indices {


    static void findAllIndices(int[] a, int n, int target, int idx){
        //base case
        if (idx >= n) return;

        //self work
        if(a[idx] == target){
            System.out.println(idx);
        }
        //recursive work
        findAllIndices(a, n, target, idx+1);


    }



    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 6, 4};
        int target = 4;
        int n = a.length;

        findAllIndices(a, n, target, 0);

    }
    
}

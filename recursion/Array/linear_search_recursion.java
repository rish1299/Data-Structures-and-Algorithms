package Array;
public class linear_search_recursion {
    

    // static boolean search(int[] a, int n, int target, int idx){

    //     //base case 
    //     if (idx >= n) return false;
        
    //     //self work
    //     if(a[idx] ==  target) return true;

    //     //recursive work
    //     return search(a, n, target, idx+1);
     
    // }


    //for returning index also
    
    static int searchwithIndex(int[] a, int n, int target, int idx){

        //base case 
        if (idx >= n) return -1;
        
        //self work
        if(a[idx] ==  target) return idx;

        //recursive work
        return searchwithIndex(a, n, target, idx+1);
     
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        int target = 4;
        int n = a.length;

        System.out.println(searchwithIndex(a, n, target, 0));

        

        // if (search(a, n, target, 0)){
        //     System.out.println("Yes");
        // } else{
        //     System.out.println("No");
        // }


    }
}

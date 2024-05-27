package sorting_Algo;

public class ProblemsOnAlgoPt2_que1 {
 //Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in linear time.
 // Assume there are no dulpicates in the array


 static void sortArr(int [] num){
    if (num.length <= 1) { // corner case
        return;
    }
    //process all adjacent elem
   int x=-1, y=-1;
    for (int i = 1; i < num.length; i++) {
        if(num[i-1]>num[i]){
            if (x==-1) { //1st conflict
                x = i-1;
                y=i;
            }
            else{ //2nd conflict
                y=i;
            }
        }
    }

    //swap x,y 
    int temp= num[x];
    num[x] = num[y];
    num[y] = temp;
 }


 public static void main(String[] args) {
    int[] num ={10, 5, 6, 7, 8, 9, 3};
    sortArr(num);
    for (int i : num) {
        System.out.print(i +" ");
    }
 }
}

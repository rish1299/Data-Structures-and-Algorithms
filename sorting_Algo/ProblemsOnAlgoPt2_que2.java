package sorting_Algo;

public class ProblemsOnAlgoPt2_que2 {
//Given an array of positib=ve and negative integers, segregate them in linear time and constant space. The output
// should print all negative numbers, followed by all positive numbers.

static void swap(int[] arr, int x , int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}
static void sortUsingPartition(int[] nums){
    int n = nums.length;
    int l = 0, r=n-1;
    while (l < r) {
        while (nums[l] < 0) l++;
        while (nums[r] >= 0) r--;

        if (nums[l] > 0 && nums[r] < 0) {
            swap(nums,l,r);
            l++;
            r--;
        }
    }

}


public static void main(String[] args) {
    int[] nums = {19, -20, 7, -4, -13, 11, -5, 3};
    sortUsingPartition(nums);
    for (int i : nums) {
        System.out.print(i + " ");
    }

}
}

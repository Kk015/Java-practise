package Sorting;

public class MergeSort {

    public static void printarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] nums = { 6, 3, 9, 5, 2, 8 };
        printarray(nums);
    }
}

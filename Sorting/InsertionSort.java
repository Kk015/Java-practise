package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 1, 7, 6 };
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

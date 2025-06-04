package Sorting;

import java.util.Arrays;

public class Bubblesort {

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 1, 6, 9 };
        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}

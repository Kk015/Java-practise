package Sorting;

import java.util.Arrays;

public class Cyclesort {

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static void cycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 2, 5, 1 };
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

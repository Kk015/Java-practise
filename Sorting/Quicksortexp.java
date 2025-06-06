package Sorting;

public class Quicksortexp {

    public static void printarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    public static void quicksort(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int partitionIndex = partition(nums, startIndex, endIndex);
        quicksort(nums, startIndex, partitionIndex - 1);
        quicksort(nums, partitionIndex + 1, endIndex);
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[endIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j < endIndex; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        i++;
        swap(nums, i, endIndex);
        return i;
    }

    public static void main(String[] args) {
        int[] nums = { 6, 3, 9, 5, 2, 8 };
        quicksort(nums, 0, nums.length - 1);
        printarray(nums);
    }
}

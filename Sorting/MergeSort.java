package Sorting;

public class MergeSort {

    public static void printarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    public static void mergeSort(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        mergeSort(nums, startIndex, mid);
        mergeSort(nums, mid + 1, endIndex);
        merge(nums, startIndex, mid, endIndex);
    }

    public static void merge(int[] nums, int startIndex, int mid, int endIndex) {
        int[] temp = new int[endIndex - startIndex + 1];

        int i = startIndex;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= endIndex) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i++];
            } else {
                temp[k] = nums[j++];
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= endIndex) {
            temp[k++] = nums[j++];
        }

        for (k = 0, i = startIndex; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 6, 3, 9, 5, 2, 8 };
        mergeSort(nums, 0, nums.length - 1);
        printarray(nums);
    }
}

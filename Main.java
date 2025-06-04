import java.util.Arrays;

public class Main {

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static void selectionSort(int[] nums) {

    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 1, 6, 9 };
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

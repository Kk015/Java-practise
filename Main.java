public class Main {

    public static void printarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    static void mergesort(int[] nums, int startIndex, int EndIndex) {
        if (startIndex >= EndIndex) {
            return;
        }
        int mid = startIndex + (EndIndex - startIndex) / 2;
        mergesort(nums, startIndex, mid);
        mergesort(nums, mid + 1, EndIndex);
        merge(nums, startIndex, mid, EndIndex);
    }

    static void merge(int[] nums, int startIndex, int mid, int EndIndex) {

        int[] temp = new int[EndIndex - startIndex + 1];

        int i = startIndex;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= EndIndex) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i++];
            } else {
                temp[k] = nums[j++];
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= EndIndex) {
            temp[k++] = nums[j++];
        }

        for (k = 0, i = startIndex; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 6, 3, 9, 5, 2, 8 };
        mergesort(nums, 0, nums.length - 1);
        printarray(nums);
    }
}

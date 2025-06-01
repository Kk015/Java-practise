package Arrays;

public class Maxsubarray {

    public static void prefixmethod(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }

        }
        System.out.println(maxsum);
    }

    public static void bruteforce(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            for (int j = i; j < nums.length; j++) {
                count += nums[j];

                if (count > max) {
                    max = count;
                }
            }
        }
        System.out.println("this is the max value " + max);

    }

    public static void kadane(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] nums = { 1, -2, 6, -1, 3 };
        // bruteforce(nums);
        // prefixmethod(nums);
        kadane(nums);
    }
}

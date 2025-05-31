package Arrays;

public class Printsubarrays {
    public static void fn(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                count++;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] num = { 2, 4, 6, 8, 10 };
        fn(num);

    }
}

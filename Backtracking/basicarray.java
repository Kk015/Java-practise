package Backtracking;

import java.util.Arrays;

public class basicarray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        changearr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void changearr(int[] arr, int i, int value) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = value;
        changearr(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2; // backtracking step
    }

}

package Backtracking;

import java.util.Arrays;

@SuppressWarnings("unused")
public class basicstringexp {

    public static void main(String[] args) {
        String str = "abc";
        // findsubsets(str, "", 0);
        permutationsets(str, "", 0);
    }

    static void permutationsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        permutationsets(str, ans + str.charAt(i), i + 1);

        permutationsets(str, ans, i + 1);
    }

    // static void findsubsets(String str, String ans, int i) {
    // // base case
    // if (i == str.length()) {
    // System.out.println(ans);
    // return;
    // }

    // // recusrion
    // // yes choice
    // findsubsets(str, ans + str.charAt(i), i + 1);
    // // no choice
    // findsubsets(str, ans, i + 1);

    // }

}

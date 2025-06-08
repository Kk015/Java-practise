public class Main {

    public static void main(String[] args) {
        String a = "abcd";
        fn(a, "", 0);
    }

    static void fn(String a, String ans, int index) {
        if (index == a.length()) {
            System.out.println(ans);
            return;
        }
        fn(a, ans + a.charAt(index), index + 1);
        fn(a, ans, index + 1);

    }
}
import java.util.Arrays;

@SuppressWarnings("unused")
public class Main {

	public static int bintodeci(int num) {
		int ans = 0;
		int pow = 0;
		while (num > 0) {
			int rem = num % 10;
			ans = ans + (rem * (int) Math.pow(2, pow));
			pow++;
			num = num / 10;

		}
		return ans;
	}

	public static int dectobin(int deci) {
		int bin = 0;
		int pow = 0;
		while (deci > 0) {
			int rem = deci % 2;
			bin = bin + (rem * (int) Math.pow(10, pow));
			deci = deci / 2;
			pow++;
		}
		return bin;
	}

	public static void main(String[] args) {
		// int a = 10001;
		// System.out.println(bintodeci(a));
		int b = 6;
		System.out.println(dectobin(b));

	}

}

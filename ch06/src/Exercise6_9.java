
public class Exercise6_9 {

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			int recurse = power(x, (n / 2));
			int result = recurse * recurse;
			return result;
		} else {
			int recurse = power(x, (n - 1));
			int result = x * recurse;
			return result;
		}
	}

	public static void main(String[] args) {
		int r = power(2, 6);
		System.out.println(r);
	}
}

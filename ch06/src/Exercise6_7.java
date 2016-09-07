
public class Exercise6_7 {

	public static void main(String[] args) {
		int myNum = 100;
		System.out.println("Odd Sum = " + oddSum(myNum));
		System.out.println("All Sum = " + allSum(myNum));
	}

	public static int oddSum(int m) {
		if (m == 1) {
			return 0;
		} else {
			if (m % 2 == 0) {
				int recurse = oddSum(m - 1);
				int result = m + recurse;
				return result;
			} else {
				int recurse = oddSum(m - 1);
				return recurse;
			}

		}
	}

	public static int allSum(int m) {
		if (m == 1) {
			return 1;
		} else {
			int recurse = allSum(m - 1);
			int result = m + recurse;
			return result;
		}
	}

}

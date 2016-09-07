

public class Exercise6_8 {
	
	public static int ack(int m, int n) {
		if (m == 0) {
			return (n + 1);
		} else if ((m > 0) && (n == 0)) {
			int recurse = ack((m - 1), 1);
			return recurse;
		} else if ((m > 0) && (n > 0)) {
			int temp = ack(m, (n-1));
			int recurse = ack((m - 1), temp);
			return recurse;
		} else {
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		int n = ack(3,2);
		System.out.println(n);
	}
}

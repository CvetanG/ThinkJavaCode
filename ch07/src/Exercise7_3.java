
public class Exercise7_3 {
	
	public static int power(int x, int n) {
		int result = 1; 
		while (n > 0) {
			result *= x;
			n--;
		}
		return result;
		
	}

	public static void main(String[] args) {
		int r = power(2, 6);
		System.out.println(r);
	}
}

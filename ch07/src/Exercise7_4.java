

public class Exercise7_4 {
	
	public static int factorial(int n) {
		int result = 1; 
		while (n > 0) {
			result *= n;
			n--;
		}
		return result;
		
	}

	public static void main(String[] args) {
		int r = factorial(4);
		System.out.println(r);
	}
}

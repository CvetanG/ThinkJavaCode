import java.util.Arrays;

public class Exercise8_5 {
	
	public static void sieve(int n) {
		int[] start = new int[n];
		boolean[] bool = new boolean[n];
		for (int i = 0; i < start.length; i++) {
			start[i] = i;
		}
		for (int i = 0; i < bool.length; i++) {
			if (start[i] == i * i) {
				bool[i] = false;
			} else {
				bool[i] = true;
			}
		}
		
		System.out.println(Arrays.toString(start));
		System.out.println(Arrays.toString(bool));
	}
	
	public static void main(String[] args) {
		sieve(120);
	}
}

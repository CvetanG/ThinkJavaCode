
public class MyMath {
	
	// Nai maluk obsht delitel
	public static int nod(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
	// Nai malko obshto kratno
	public static int nok(int a, int b) {
			int nod = nod(a, b);
			int result = a * b;
		return result / nod;
	}

	public static void main(String[] args) {
		System.out.println(nod(1071, 462));
		System.out.println(nok(1071, 462));
	}
}

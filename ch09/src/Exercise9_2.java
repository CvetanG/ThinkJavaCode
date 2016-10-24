import java.util.Arrays;

public class Exercise9_2 {

	public static void letterHist(String lettersCount) {

		String temp = lettersCount.toLowerCase();

		char[] myCharsFromString = temp.toCharArray();

		// creating alfabet array
		char[] alfabet = new char[25];
		char c = 'a';
		for (int i = 0; i < alfabet.length; i++) {
			alfabet[i] = c;
			c++;
		}

		// making a histogram
		int[] counts = new int[25];

		for (int i = 0; i < myCharsFromString.length; i++) {
			char index = myCharsFromString[i];
			for (int j = 0; j < alfabet.length; j++) {
				if (alfabet[j] == index) {
					counts[j]++;
				}
			}

		}

		System.out.println(Arrays.toString(alfabet));
		System.out.println(Arrays.toString(counts));

	}

	public static void main(String[] args) {
		letterHist("My test");

	}
}

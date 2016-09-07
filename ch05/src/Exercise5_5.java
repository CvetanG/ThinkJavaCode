import java.util.Scanner;

public class Exercise5_5 {
	
	public static void printLyrics(int n) {
        if (n == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println(n + " bottles of beer on the wall,");
            System.out.println(n + " bottles of beer");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println((n - 1) + " bottles of beer on the wall.");
            System.out.println();
            printLyrics(n - 1);
        }
    }
	
	
	public static void main(String[] args) {
		scanInput();	
	}
	
	public static void scanInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of Beers: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            scanInput();
        }
        int x = in.nextInt();
        printLyrics(x);
    }
	
}

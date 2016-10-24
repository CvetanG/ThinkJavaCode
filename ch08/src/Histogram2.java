import java.util.Arrays;
import java.util.Random;

/**
 * Example code related to histograms.
 */
public class Histogram2 {

    /**
     * Returns an array of random integers.
     */
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {

        int[] scores = randomArray(100);

        // making a histogram
        int[] counts = new int[100];
        for (int i = 0; i < scores.length; i++) {
            int index = scores[i];
            counts[index]++;
        }
        
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(counts));

    }

}

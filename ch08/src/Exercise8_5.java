import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise8_5 {
		
		public static  void sieve(int limit) {
			
			int[] nums = new int[limit];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = i;
			}
			System.out.println(Arrays.toString(nums));
			
			boolean[] bool = new boolean[limit];
			for (int i = 2; i < bool.length; i++) {
				bool[i] = true;
			}
			
			// Mark all composite numbers
			for (int i = 2; i < (bool.length / 2); i++) {
				if (bool[i]) {
//					bool[i] = false;
					int multiple = 2;
					while (i * multiple < bool.length) {
						bool [i * multiple] = false;
						multiple++;
					}
				}
			}
		
			
			Map myMap = new HashMap(bool.length);
			for (int i = 0; i < nums.length; i++) {
				myMap.put(nums[i], bool[i]);
			}
			
			
			System.out.println(Arrays.toString(bool));
			System.out.println(myMap);
		}
	
	public static void main(String[] args) {
		sieve(120);
	}
}

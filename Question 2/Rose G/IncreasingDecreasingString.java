import java.util.Arrays;
/**
 * 
 * @author Rose Griffin
 *
 */
public class IncreasingDecreasingString {
	
	public static void main(String[] args) {
		System.out.println(sortString("aaaabbbbcccc") + " Should be: abccbaabccba\n");
		System.out.println(sortString("rat") + " Should be: art\n");
		System.out.println(sortString("leetcode") + " Should be: cdelotee\n");
		System.out.println(sortString("ggggggg") + " Should be: ggggggg\n");
		System.out.println(sortString("spo") + " Should be: ops\n");
	}
	
	public static String sortString(String s) {
		int[] freq = countFreq(s);
		StringBuilder result = new StringBuilder(); 
		
		while (result.length() < s.length()) {
			System.out.println("Start loop: " + Arrays.toString(freq));
			
			//Forwards
			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > 0) {
					System.out.println("Adding: " + (char)(i + 'a') + " From index: " + i);
					result.append((char)(i + 'a'));
					freq[i] -= 1;
				}
			}
			
			//Backwards
			for (int i = freq.length-1; i >= 0; i--) {
				if (freq[i] > 0) {
					System.out.println("Adding: " + (char)(i + 'a') + " From index: " + i);
					result.append((char)(i + 'a'));
					freq[i] -= 1;
				}
			}
		}
		return result.toString();
	}
	
	public static int[] countFreq(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a'] += 1;
		}
		return freq;
	}
}

import java.util.HashMap;
import java.util.Map;
/**
 * Determines if two words are anagrams
 * @author Rose Griffin
 *
 */
public class Anagram {

	public static void main(String[] args) {
		//Regular anagram
		String raOne = "Inch";
		String raTwo = "Chin";
		//Multi word anagram
		String mwOne = "Dormitory";
		String mwTwo = "Dirty Room";
		//One word with whitespace
		String wwOne = "Below ";
		String wwTwo = "  El bow  ";
		//Not anagrams, extra letters
		String elOne = "Dessert";
		String elTwo = "Stressed";
		//Not anagrams, different letters
		String dlOne = "cat";
		String dlTwo = "bat";
		
		System.out.println("Are anagrams: " + areAnagrams(raOne, raTwo) + "\n"); //Should be true
		System.out.println("Are anagrams: " + areAnagrams(mwOne, mwTwo) + "\n"); //Should be true
		System.out.println("Are anagrams: " + areAnagrams(wwOne, wwTwo) + "\n"); //Should be true
		System.out.println("Are anagrams: " + areAnagrams(elOne, elTwo) + "\n"); //Should be false
		System.out.println("Are anagrams: " + areAnagrams(dlOne, dlTwo) + "\n"); //Should be false
	}
	
	/**
	 * Checks if two words are anagrams. 
	 * Two strings are considered anagrams if their corresponding maps are equal, or in other words,
	 * the letters occur in each word the same amount of times.
	 */
	public static boolean areAnagrams(String first, String second) {
		return countLetters(first).equals(countLetters(second));
	}
	
	/**
	 * Stores the amount of times a letter occurs in the passed in word in a map.
	 * The key is the letter, while the value is the amount of times that letter occurs
	 * in the word.
	 */
	public static Map<Character, Integer> countLetters(String word) {
		String wordLower = word.toLowerCase();
		Map <Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < wordLower.length(); i++) {
			char currentLetter = wordLower.charAt(i);
			//Ignore whitespace characters
			if (currentLetter != ' ') {
				Integer value = map.get(wordLower.charAt(i));
				//If the value at this key is null, set it to one. Else, increment the current value
				if (value == null)
					map.put(currentLetter, 1);
				else
					map.put(currentLetter, value + 1);
			}
		}
		System.out.println(word + " : " + map);
		return map;
	}

}

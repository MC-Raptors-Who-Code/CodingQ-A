public class JewelsAndStones {
	
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	}
	
	public static int getIndex(int a) {
		return a = a < 97 ? a - 65 : a - 97 + 26;
	}
	
	public static int numJewelsInStones(String jewels, String stones) {
		int[] jewelArr = new int[26*2];
		jewels.chars().map(c -> {
			return getIndex(c);
		}).forEach(c -> {
			jewelArr[c] += 1;
		});
		return (int) stones.chars().map(c -> {
			return getIndex(c);
		}).filter(c -> {
			return jewelArr[c] > 0;
		}).count();
	}
}

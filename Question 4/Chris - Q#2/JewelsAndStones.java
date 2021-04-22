public class JewelsAndStones {
	
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels, stones));
		System.out.println(numJewelsInStones2(jewels, stones));
	}
	
	public static int getIndex(int a) {
		return a < 97 ? a - 65 : a - 97 + 26;
	}
	
	public static int numJewelsInStones(String jewels, String stones) {
		int[] jewelArr = new int[26*2];
		jewels.chars().map(JewelsAndStones::getIndex).forEach(c -> jewelArr[c] += 1);
		return (int) stones.chars().map(JewelsAndStones::getIndex).filter(c -> jewelArr[c] > 0).count();
	}
	
	public static int numJewelsInStones2(String jewels, String stones) { 
		return (int) jewels.chars().flatMap(c -> stones.chars().filter(d -> c==d)).count();
	}
	
}

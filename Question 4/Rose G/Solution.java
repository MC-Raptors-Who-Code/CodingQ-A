class Solution {
    public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
            		//Check if the character at the current index is in jewels
			if (jewels.indexOf(stones.charAt(i)) != -1)
				count++;
		}
		return count;
    }
}

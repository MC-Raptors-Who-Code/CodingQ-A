public:
	int numJewelsInStones(string jewels, string stones){
		int count = 0;
		
		// Creates a set which contains characters in jewels for faster search
		std::unordered_set<char> charSet( jewels.begin(), jewels.end() );
		
		// If character in s is in the set, increment counter
		for (char s : stones)
			if (charSet.find(s) != charSet.end())
				count++;
		return count;
	}

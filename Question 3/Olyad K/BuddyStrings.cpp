    bool buddyStrings(string a, string b) {
        vector<int> indexOfDiffs;
        
        for (int i = 0; i < a.length(); i++) 
            if (a[i] != b[i])
                indexOfDiffs.push_back(i);
        
        if (indexOfDiffs.size() == 2) {
            
            char temp = a[indexOfDiffs.at(0)];
            a[indexOfDiffs.at(0)] = a[indexOfDiffs.at(1)];
            a[indexOfDiffs.at(1)] = temp;
            
            if (a.compare(b) == 0)
                return true;
            
        }
        
        if (indexOfDiffs.size() == 0) {
            
            int charFreq[26] = {0};
            for (int i = 0; i < a.length(); i++) {
                if (charFreq[a[i] - 97] < 1)
                    charFreq[a[i] - 97]++;
                else
                    return true;
            }
            
        } 
        
        return false;

   }

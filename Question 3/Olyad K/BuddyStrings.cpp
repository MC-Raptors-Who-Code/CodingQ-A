bool buddyStrings(string a, string b) {
    
    vector<int> indexOfDiffs;

    // Create vector which tracks the index of each character if it differs from b
    for (int i = 0; i < a.length(); i++) 
        if (a[i] != b[i])
            indexOfDiffs.push_back(i);

    // If there are exactly two differences between the strings, switch the chars in a and see if strings match
    if (indexOfDiffs.size() == 2) {
        
        char temp = a[indexOfDiffs.at(0)];
        a[indexOfDiffs.at(0)] = a[indexOfDiffs.at(1)];
        a[indexOfDiffs.at(1)] = temp;

        if (a == b)
            return true;

    }

    // If strings are equal, check if there is a character that appears at least twice
    if (indexOfDiffs.size() == 0) {

        // Create frequency array
        int charFreq[26] = {0};
        
        // Go through string; If a character has more than 2, return true, otherwise add to char count
        for (int i = 0; i < a.length(); i++) {
            if (charFreq[a[i] - 97] < 1)
                charFreq[a[i] - 97]++;
            else
                return true;
        }

    } 
    
    // If there's only 1 difference, or more than 2 differences, return false
    return false;

}

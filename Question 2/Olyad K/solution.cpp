//
//  solution.cpp
//  minOperations
//
//  Created by Olyad Kitila on 3/15/21.
//  Explained and validated on 3/25/21✔✔✔

#include <iostream>
#include <vector>
using namespace std;

vector<int> minOperations(string boxes) {
    vector<int> answer;
    
    for (int i = 0; i < boxes.length(); i++) {
        int moves = 0;
        
        for (int j = 0; j < boxes.length(); j++)
            if ((boxes[j] - '0') == 1)
                moves += abs(i - j);
        
        answer.push_back(moves);
    }
    
    return answer;
}

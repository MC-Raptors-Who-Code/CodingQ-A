//  This solution is for the leetcode idle
//  It will probably not run directly on your VStudio (or whatever idle you use) 
//  Franco Edah 04/15/2021 ✔✔✔
//  Question #1
//  https://leetcode.com/problems/add-digits/



class Solution {
public:
    
    bool isDigit(int num){
        if ( num >=0 && num <= 9)
            return true; 
        else
            return false; 
    }
    
    int addDigits(int num) {
        
        if (isDigit(num))
            return num; 

        else{
            
            int total = 0; 
            while (!isDigit(num)){
                total += num % 10;
                num = num/10; 
            }
            total += num;
            
            int solution = addDigits(total); 
            
            return solution; 
        }  
        
    }
    
    
};
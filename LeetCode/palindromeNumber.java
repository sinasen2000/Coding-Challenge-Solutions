/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/

//Solution 1:
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int a = x;
        int bingo = 0;
        int lastDigit;
            while(x!= 0){
                lastDigit = x % 10;
                bingo += lastDigit;
                x = x / 10;
                if(x != 0){
                bingo = bingo * 10;
                }
            }
        if(bingo == a){
            return true;
        }else{
            return false;
        }
    }
}
/*
Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number. (wow)
Memory Usage: 36.7 MB, less than 5.01% of Java online submissions for Palindrome Number.
*/

//Solution 2:
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(s.length() - 1 - i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
/*
Runtime: 8 ms, faster than 40.89% of Java online submissions for Palindrome Number.
Memory Usage: 36.7 MB, less than 5.01% of Java online submissions for Palindrome Number.
*/
/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

// O(n^2) solution using a set
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> c = new HashSet<Character>();
        int max = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(c.contains(s.charAt(j))) {
                    c.clear();
                    if(count > max) {
                        max = count;
                    }
                    count = 0;
                    break;
                }
                c.add(s.charAt(j));
                count++;
            }
        }
        return Math.max(max, count);
    }
}

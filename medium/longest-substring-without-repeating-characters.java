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
  
   // O(n) solution using sliding window and also a hash set
  // 11 ms faster than 38.25% of Java online submissions
  // 37.2MB less than 98.44% of Java online submissions
  public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        int count = 0;;
        Set<Character> chars = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if(!chars.contains(s.charAt(j))) {
                chars.add(s.charAt(j));
                j++;
                count++;
            }
            else {
                chars.remove(s.charAt(i));
                i++;
                if (count > max) {
                    max = count;
                }
                count--;
            }
        }
        return Math.max(max, count);
    }
}
  
 

// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
// Note:

// All given inputs are in lowercase letters a-z.


/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(strs === undefined || strs.length === 0) {
        return "";
    }
    var min = Number.MAX_VALUE;
    for(var i = 0; i < strs.length; i++) {
        if(min > strs[i].length) {
            min = strs[i].length;
        }
    }
    var i = 0;
    var prefix = "";
    while (i < min) {
        var temp = strs[0].charAt(i);
        for(var j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) != temp) {
                return prefix;
            }
        }
        prefix += temp;
        i++;
    }
    return prefix;
};

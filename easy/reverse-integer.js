/*
*Given a 32-bit signed integer, reverse digits of an integer.

*Example 1:

*Input: 123
*Output: 321
*Example 2:

*Input: -123
*Output: -321
*Example 3:

*Input: 120
*Output: 21
*Note:
*Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    var str = x.toString();
    var reversed = "";
    // check if number is negative, and add negative symbol to the parsed string
    if(x < 0) {
        reversed += "-"
    }
    for(var i = str.length - 1; i >= 0; i--) {
        reversed += str.charAt(i);
    }
    var reversedInt = parseInt(reversed);
    // edge case: if we have integer overflow we return 0
    if(reversedInt > (2 ** 31) - 1 || reversedInt < (2 ** 31) * -1) {
        return 0;
    }
    return reversedInt;
};

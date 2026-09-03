package SET1;
/*Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */

import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int i=0; i<s.length(); i++){
            //If duplicate foudn 
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
                //shrinking window size by inc lefft
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen,i-left+1);
        }
        System.out.println(maxLen);
    }
}

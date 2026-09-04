/*On a rainy Saturday afternoon, best friends Aarav and Meera were holed up inside, the thunder rumbling 
in the distance. With no power and their usual gadgets dead, they turned to an old pastime—brain games."I 
have a challenge," Aarav said, grinning as he grabbed a notebook. "Let’s play a game: find the longest 
palindromic substring from a random sentence., now our  task is to find the longest substring which is a 
palindrome. If there are multiple answers, then return the first appearing substring. 
 
Examples: 
Input: s = “noonracecar”  
Output: “racecar” 
Explanation: There are several possible palindromic substrings like “noon”, “oo”, “racecar” etc. But the 
substring “racecar” is the longest among all. 
 
Input: s = “samantha”  
Output: “ama” 
Input: s = “rebecca”  
Output: “ebe” 
Input: s = “madam”  
Output: “madam”  */


import java.util.*;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int start = 0;
        int end = 1;
        for(int i=0; i<s.length(); i++){
            int len = extra(s,i,i);
            int maxLen = extra(s,i,i+1);
            int result = Math.max(len,maxLen);
            if(result>end){
                end = result;
                start = i-(result-1)/2;
            }
        }
        System.out.println(s.substring(start,end+start));
    }
    public static int extra(String s, int a, int b) {
        while(a>=0 && b<s.length() && s.charAt(a)==s.charAt(b)){
            a--;
            b++;
        }
        return b-a-1;
    }
}

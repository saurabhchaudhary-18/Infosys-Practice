/*.In the land of Lexiconia, the royal scribe was tasked with writing a magical scroll using a string of letters. But 
the scroll had one sacred rule: no two identical letters could be written side by side, or the spell would fail. The 
scribe was handed strings like "aaabc" and "aaabb" and had to rearrange them so that no two adjacent 
characters were the same. 
He carefully counted how many times each letter appeared. If any letter appeared more than half the 
length of the string (rounded up), he knew it would be impossible to arrange without breaking the rule. 
Otherwise, he placed the most frequent letters at alternating positions and filled in the rest. 
The king marveled as the scrolls lit up in magical light, proving the arrangements were perfect. The method 
was passed down for generations as the "Non-Adjacent Rune Rule." 
Test Cases: 
Input: s = "aaabc" 
Output: 1 
Explanation: Rearranged as "abaca" or "acaba" — no adjacent duplicates. 
Input: s = "aaabb" 
Output: 1 
Explanation: Rearranged as "ababa" — valid rearrangement. 
Input: s = "aaaabc" 
Output: 0 
Explanation: Too many 'a's — cannot rearrange without adjacent duplicates. */


import java.util.*;
public class LandLexiconia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        int maxFreq = 0;
        for(int x : freq){
            if(x>maxFreq){
                maxFreq = x;
            }
        }
        if(maxFreq>(s.length()/2)+1){
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}

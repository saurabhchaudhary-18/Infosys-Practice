/*.Given two strings s1 and s2, the task is to find the length of the shortest string that has both s1 and s2 as 
subsequences. 
Examples:  
Input: s1 = “geek”, s2 = “eke” 
Output: 5 
Explanation: String “geeke” has both string “geek” and “eke” as subsequences. 
Input: s1 = “AGGTAB”, s2 = “GXTXAYB” 
Output: 9 
Explanation: String “AGXGTXAYB” has both string “AGGTAB” and “GXTXAYB” as subsequences. */

import java.util.*;
public class StringMerge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int lcs = dp[n][m];
        System.out.println(s1.length()+s2.length()-lcs);
    }
}

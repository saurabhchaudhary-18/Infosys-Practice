/* In the quiet village of Sumridge, two curious friends, Arya and Rohan, were known for their love of 
puzzles and challenges. One sunny afternoon, while rummaging through Arya’s attic, they found an old 
wooden box filled with ancient coins of different values 1, 2, 5.. units. 
Attached to the box was a note: 
“To claim the treasure of Sumridge, find all the ways to make the number N using these coins.” 
Our task is to help them and the total Number of  combinations are possible using these coins?” 
Note: Assume that you have an infinite supply of each type of coin.  
Examples:  
Input: sum = 4, coins[] = [1, 2, 3] 
Output: 4 
Explanation: There are four solutions: [1, 1, 1, 1], [1, 1, 2], [2, 2] and [1, 3] 
Input: sum = 10, coins[] = [2, 5, 3, 6] 
Output: 5 
Explanation: There are five solutions:  
[2, 2, 2, 2, 2], [2, 2, 3, 3], [2, 2, 6], [2, 3, 5] and [5, 5] 
Input: sum = 10, coins[] = [10] 
Output: 1 
Explanation: The only is to pick 1 coin of value 10. 
Input: sum = 5, coins[] = [4] 
Output: 0 
Explanation: We cannot make sum 5 with the given coins  */

import java.util.*;
public class NoWaysofCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        int n = input.nextInt();
        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = input.nextInt();
        }
        int[] dp = new int[sum+1];
        dp[0] = 1;
        for(int x : coins){
            for(int am = x; am<=sum; am++){
                dp[am] += dp[am-x];
            }
        }
        System.out.println(dp[sum]);
    }
}

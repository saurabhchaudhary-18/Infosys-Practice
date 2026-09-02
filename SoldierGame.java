/*General Ali has devised a strategic game to reduce
an enemy army of N soldiers to just 1 soldier using a
minimal number of moves.
The game allows the following three types of
moves:
1. Reduce the enemy army by 1 soldier.
2. Reduce the enemy army by half of its current
soldiers, rounding down to the nearest integer.
3. Reduce the enemy army by two-thirds of its
current soldiers, rounding down to the nearest
integer.
Each move must ensure that the resulting number
of soldiers is an integer.
Find the minimum number of moves required to
reduce enemy army to just 1 soldier.
Input Format
The first line contains an integer, N, denoting the
number of enemy soldiers.
Constraints
1 <= N <= 10^9
Sample Test Cases
Case 1
Input:
5
Output:
3
Explanation:
Given N = 5.
Move 1: Reduce by 1 soldier (5 -> 4)
Move 2: Reduce by half (4 -> 2)
Move 3: Reduce by half (2 -> 1)
Hence, the answer for this case is equal to 3. */

import java.util.*;
public class SoldierGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(solve(n));
    }
    public static int solve(int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        if(n<=1){
            return 0;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int ans = 1+solve(n-1);

        //aspply half operation
        if(n%2==0){
            ans = Math.min(ans,1+solve(n/2));
        }
    

        //apply two third operation
        if(n%3==0){
            ans = Math.min(ans,1+solve(n/3));
        }
        map.put(n,ans);
        return ans;
    }
}

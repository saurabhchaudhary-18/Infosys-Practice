/*In the twin cities of Numeria, two teams — Team A and Team B — were preparing for a grand 
partner dance. Each dancer in Team A had to be paired with a dancer from Team B. But there was a 
rule: the more different their dance styles (represented by numbers), the more awkward the dance — 
and the higher the cost in energy. 
The elders wanted the total awkwardness (the sum of absolute differences in style between all pairs) to be 
as low as possible. A wise mathematician stepped in and gave a clever solution: sort both teams by their 
style levels and pair them in order. 
By doing this, the differences between each pair were minimized. The dance went smoothly, the crowd 
cheered, and the method became known as the “Minimum Awkward Pairing” strategy — a dance of logic 
and balance. 
Test Cases: 
Input: 
N = 4, A = [4, 1, 8, 7], B = [2, 3, 6, 5] 
Output: 6 
Explanation: Sorted A = [1, 4, 7, 8], B = [2, 3, 5, 6] 
Sum = |1-2| + |4-3| + |7-5| + |8-6| = 1 + 1 + 2 + 2 = 6 
 
Input: 
N = 3, A = [4, 1, 2], B = [2, 4, 1] 
Output: 0 
Explanation: Sorted A = [1, 2, 4], B = [1, 2, 4] 
Sum = |1-1| + |2-2| + |4-4| = 0 
Input: 
N = 5 ,A = [10, 20, 30, 40, 50] , B = [12, 18, 35, 38, 52] 
Output: 14 
Constraints: 
1 <= N <= 105 
0 <= A[i] <= 109 
0 <= B[i] <= 109 
Sum of N over all test cases doesn't exceeds 106  */


import java.util.*;
public class MinimumDiff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] teamA = new int[n];
        int[] teamB = new int[n];
        for(int i=0; i<n; i++){
            teamA[i] = input.nextInt();
        }
        for(int i=0; i<n; i++){
            teamB[i] = input.nextInt();
        }
        Arrays.sort(teamA);
        Arrays.sort(teamB);
        int minDiff = 0;
        for(int i=0; i<n; i++){
            minDiff += Math.abs(teamA[i]-teamB[i]);
        }
        System.out.println(minDiff);
    }
}

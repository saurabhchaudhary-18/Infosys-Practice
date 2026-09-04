/*In the quiet village of Splitville, there was a wise elder named Mira who had a magical pouch full of coins,
each with different values. One day, she challenged the village children: “Pick the fewest number of coins from
this pouch such that their total value is greater than the value of all the coins left behind.” The children were
puzzled — grabbing more coins meant winning, but they had to be smart.
One clever child sorted the coins from largest to smallest and picked them one by one, keeping a running
total. She stopped as soon as her sum became greater than what remained in the pouch. Mira clapped in joy
— the child had cracked the puzzle using logic, not greed. From then on, this became a famous brain game in
Splitville known as the “Heavier Half.”
Test Cases:
Input: arr = [2, 17, 7, 3]
Output: 1
Explanation: Select only 17. Remaining sum is 12, and 17 > 12.
Input: arr = [20, 12, 18, 4]
Output: 2
Explanation: Select 18 and 12. Total = 30, remaining = 24.
Input: arr = [1, 1, 1, 1, 10]
Output: 1
Explanation: Select 10. Remaining sum is 4.
Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 104
 */

import java.util.*;
public class HeavenHalf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int totalSum = 0;
        for(int x : arr){
            totalSum += x;
        }
        int reqSum = 0;
        Arrays.sort(arr);
        int cnt = 0;
        for(int i=n-1; i>=0; i--){
            totalSum -=arr[i];
            reqSum = reqSum + arr[i];
            cnt++;
            if(reqSum>totalSum){
                break;
            }
        }
        System.out.println(cnt);
    }
}

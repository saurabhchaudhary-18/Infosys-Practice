/*. In the merchant city of Greedonia, a young trader named Elric was setting off on a journey with a 
magical knapsack. This bag could carry only a limited weight, but there was a twist — Elric could break any 
item and take a fraction of it if needed. Each item in his inventory had a value and a weight. 
His goal? Maximize the value of what he could carry without exceeding the knapsack’s capacity. So Elric 
sorted all his items by their value-to-weight ratio, starting with the most valuable per kilogram. He packed 
full items as long as the bag allowed, and when he reached the limit, he sliced off just enough of the next 
most valuable item to fit perfectly. 
With a bag filled to the brim and value maximized, Elric set off richer than ever before. The townsfolk 
called this clever method “The Fractional Knapsack Strategy,” and it became a treasured algorithm in the 
Guild of Traders. 
Test Cases: 
Input: 
val = [60, 100, 120] 
wt = [10, 20, 30] 
capacity = 50 
Output: 240.000000 
Explanation: Take items 1, 2 completely and 2/3 of item 3. 
Input: 
val = [60, 100] 
wt = [10, 20] 
capacity = 50 
Output: 160.000000 */

import java.util.*;
public class EricKnapsack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        for(int i=0; i<n; i++){
            val[i] = input.nextInt();
        } 
        for(int i=0; i<n; i++){
            wt[i] = input.nextInt();
        }
        int cap = input.nextInt();
        int ans = 0;
        //Since given data already sorted so easy to operate
        for(int i=0; i<n; i++){
            if(cap>wt[i]){
                ans  = ans + val[i];
                cap = cap - wt[i];
            } else {
                int t = val[i]*cap;
                t = t/wt[i];
                ans = ans + t;
                break;
            }
        }
        System.out.println(ans);

    }
}

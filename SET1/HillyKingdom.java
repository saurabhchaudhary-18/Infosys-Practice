
/* In the hilly kingdom of Altaria, each village was built on a tower of different height. The king wanted to even 
out the landscape as much as possible, so that no tower looked too tall or too short compared to others. To do 
this, he ordered the builders to either raise or lower every tower’s height by exactly K meters — no exceptions! 
But there was a rule: no tower could be made shorter than zero. The royal architect, Mira, studied the towers 
carefully. She realized that by strategically increasing some towers and decreasing others, she could bring 
their heights closer together. Her goal was to minimize the difference between the tallest and shortest 
towers after these adjustments. 
She tested different combinations and figured out the perfect plan: sort the tower heights first, then consider 
the highest and lowest possible new heights, and make adjustments while keeping all towers non-negative. 
After a day of calculations, she presented the best possible layout to the king. Delighted, he declared Mira the 
“Balancer of Towers,” and her technique was taught to architects across Altaria. 
 
Examples :  
Input: k = 2, arr[] = {1, 5, 8, 10} 
Output: 5 
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the 
largest and the smallest is 8-3 = 5. 
Input: k = 3, arr[] = {3, 9, 12, 16, 20} 
Output: 11 
Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference 
between the largest and the smallest is 17-6 = 11.  
Input:k = 3, arr[] = {7, 7, 7, 7} 
Output: 0 */

import java.util.*;
public class HillyKingdom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int avg = 0;
        for(int x : arr){
            avg = avg+x;
        }
        avg = avg/n;
        for(int i=0; i<n; i++){
            if(arr[i]<avg){
                arr[i] = arr[i]+k;
            } else if(arr[i]>avg){
                arr[i] = arr[i]-k;
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x : arr){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        System.out.println(max-min);
    }    
}

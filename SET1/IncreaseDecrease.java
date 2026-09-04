/*.In the kingdom of Arraya, there lived a wizard who loved symmetry — especially in the form of non
increasing sequences. One day, he stumbled upon a magical scroll with numbers that danced out of order. 
The scroll read: {3, 1, 2, 1}. This bothered him, as the numbers weren't steadily decreasing or staying the 
same. 
To restore harmony, the wizard could use his magic to either increase or decrease any number, but he 
wanted to use the least amount of magic possible. So he cast spells to gently lower numbers that 
disrupted the order, ensuring each number was not greater than the one before it. 
Sometimes, only a single spell was needed. Other times, when a number spiked too high, he had to use 
several spells. His goal was simple: bring order to chaos using minimum effort. 
And so, his technique became known across Arraya as the "Descending Order Charm." 
 
Test Cases: 
Input: 
N = 4, array = [3, 1, 2, 1] 
Output: 1 
Explanation: Decrease 2 to 1 → new array: [3, 1, 1, 1] 
 
Input: 
N = 4, array = [3, 1, 5, 1] 
Output: 4 
Explanation: Decrease 5 to 1 → 4 steps 
Input: 
N = 5 ,array = [10, 9, 11, 7, 6] 
Output: 2 
Constraints: 
1 <= n <= 10^4 
1 <= a[i] <= 10^4 */

import java.util.*;
public class IncreaseDecrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        } 
        int ans = 0;
        //For Element of array ifd not satisfy condition
        if (arr[0]<arr[1]) {
            ans = ans + arr[1] - arr[0];
        }
        for(int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1]){
                ans = ans + Math.abs(arr[i]-arr[i-1]);
            }
        }
        //For last element of array iof not satisfy condition...
        //Only decreasement will give optimnal answer not need to increasement
        if (arr[n-1]>arr[n-2] && n>2) {
            ans = ans + arr[n-1]-arr[n-2];
        }
        System.out.println(ans);
    }
}

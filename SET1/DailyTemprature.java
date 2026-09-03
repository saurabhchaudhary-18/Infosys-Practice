package SET1;
/*Given an array of integers temperatures represents the daily temperatures, return an array answer such that
answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no
future day for which this is possible, keep answer[i] == 0 instead.
Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0] */

import java.util.*;
public class DailyTemprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = input.nextInt();
        }
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        //Ussing Monotonic Stack
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                result[st.peek()] = i-st.pop();
            }
            st.push(i);
        }
        for(int x : result){
            System.out.print(x+" ");
        }
    }
}

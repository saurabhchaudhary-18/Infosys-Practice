/*Once upon a time in a small village, a wise king wanted to attend as many village festivals as possible in one
day. Each festival had a start and end time, and the king could only attend one at a time. His advisor suggested
picking only the festivals that ended the earliest, so he could fit more in. The king followed this advice, selecting
the next festival that started after the last one ended. By the end of the day, he had enjoyed the most
celebrations possible without any overlaps. The villagers were amazed at his perfect schedule, and the king
declared it a royal strategy for future festivals.
Examples:
Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: A person can attend 4 functions. The maximum set of functions that can be attended is {0, 1, 3, 4}
(These are indexes in start[] and finish[])
Input: start[] = [10, 12, 20], finish[] = [20, 25, 30]
Output: 1
Input:
start[] = [1, 1, 1], finish[] = [4, 3, 2]
Output: 1
 */

import java.util.*;

public class MaximumFestival {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i=0; i<n; i++){
            start[i] = input.nextInt();
        }
        for(int i=0; i<n; i++){
            end[i] = input.nextInt();
        }
        int[][] timeslap = new int[n][2];
        for(int i=0; i<n; i++){
            timeslap[i][0] = start[i];
            timeslap[i][1] = end[i];
        }
        Arrays.sort(timeslap, (a,b) -> a[1]-b[1]);
        int cnt = 0;
        int last = -1;
        for(int i=0; i<n; i++){
            if(timeslap[i][0]>=last){
                cnt++;
                last = timeslap[i][1];
            }
        }
        System.out.println(cnt);
    }
}

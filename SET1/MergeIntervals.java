/*.In the city of Timetron, schedules were sacred. Every citizen had a list of time intervals when they 
needed access to the magical gates of transit. But chaos broke out — people’s time slots overlapped, and 
arguments erupted over who reserved what. 
The wise Scheduler stepped in. She laid out all the intervals on a grand timeline and sorted them by their 
start times. One by one, she merged overlapping time slots into larger blocks, ensuring no overlap 
remained — but no time was lost either. 
Soon, everyone had clean, non-overlapping windows. Conflicts vanished, the gates flowed smoothly, and 
the process became known as the “Time Merge Protocol”, essential in all future scheduling. 
 
Test Cases: 
Input: 
arr = [[1,3], [2,4], [6,8], [9,10]] 
Output: [[1,4], [6,8], [9,10]] 
Explanation: [1,3] and [2,4] overlap → merged to [1,4]. 
 
Input: 
arr = [[6,8], [1,9], [2,4], [4,7]] 
Output: [[1,9]] 
Explanation: All intervals overlap with [1,9], so they merge into one. 
Input: 
arr = [[1, 5], [10, 15], [5, 10], [20, 25]] 
Output: [[1, 15], [20, 25]] 
Constraints: 
1 ≤ arr.size() ≤ 105 
0 ≤ starti ≤ endi ≤ 105 */

import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //no. of intervals 
        int[][] intervals = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                intervals[i][j] = input.nextInt();
            }
        
        }
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        int[] arr = new int[2];
        for(int i=1; i<n; i++){
            if(intervals[i][0] <= end){
                end = Math.max(intervals[i][1],end);
            } else {

                //This addd function only add referrence memory allocation for this arrray only 
                //It will not store actuall data i.e. I@fhfhh4
                //It will work on coding platform but not on vsc//////
                res.add(arr);
                start = intervals[i][0];
                end = intervals[i][1];
                arr[0] = start;
                arr[1] = end;
            }
        }
        res.add(arr);
        System.out.println(res);
    }
}

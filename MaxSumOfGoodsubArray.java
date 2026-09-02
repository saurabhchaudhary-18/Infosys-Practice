/*You are given an array A of length N and an
integer k.
It is given that a subarray from l to r is considered
good, if the number of distinct elements in that
subarray doesn’t exceed k. Additionally, an empty
subarray is also a good subarray and its sum is
considered to be zero.
Find the maximum sum of a good subarray.
Sample Input 1
11
2
1
2
2
3
2
3
5
1
2
1
1
Sample Output 1
12
Sample Output Description 1
Here, N = 11, k = 2
A = [1, 2, 2, 3, 2, 3, 5, 1, 2, 1, 1]
We can select the subarray = [2, 2, 3, 2, 3]
It is a good subarray because it contains at most k
distinct elements.
Its sum = 2+2+3+2+3 = 12
So, our answer is 12. */

import java.util.*;
public class MaxSumOfGoodsubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();  
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<n; i++){
            //adding current elemett
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            sum = sum + arr[i];

            //shrinking window size accordingly
            while(map.size()>k){
                int element = arr[left];
                sum= sum - element;
                map.put(element,map.get(element)-1);
                if(map.get(element)==0){
                    map.remove(element);
                }
                left++;
            }
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}

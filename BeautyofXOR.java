/*You are given an array A of size N.
You can partition A into multiple subarrays such
that each element belongs to exactly one subarray
and each subarray has a length of at least K.
The beauty of a subarray is the maximum bitwise
XOR of the values of a subset in that subarray. The
amazingness of a partitioned array is the sum of
beauties of its subarrays.
Find the maximum possible amazingness of A.
Note:
• A subarray is a contiguous part of the array.
Input Format
The first line contains an integer, N, denoting the
number of elements in A.
The next line contains an integer, K, denoting the
given integer.
Each line i of the N subsequent lines (where 0 ≤ i <
N) contains an integer describing A[i].
Constraints
1 <= N <= 10^5
1 <= K <= 10^5
1 <= A[i] <= 10^5

Sample Test Cases
Case 1
Input:
2
2
2
1
Output:
3
Explanation:
Given N = 2, K = 2, A = [2, 1].
We take the entire A as one subarray as [2, 1] with
maximum amazingness equal to 3.
Hence, the answer for this case is equal to 3. */

import java.util.*;
public class BeautyofXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();

        }
        int bits = 17;
    }
}

package SET1;
/*4.Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

Constraints:
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any subarray of nums is guaranteed to fit in a 32-bit integer. */

import java.util.*;
public class LargestProductSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int temp = Math.max(curr,Math.max(min*curr, max*curr));
            min = Math.min(curr,Math.min(min*curr,max*curr));
            max = temp;
            result = Math.max(result,max);
        }
        System.out.println(result);
    }
}

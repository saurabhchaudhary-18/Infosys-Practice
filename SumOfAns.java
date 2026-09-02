/*You’re given an array A of n integers and q queries.
Each query can be one of the following two types:
• Type 1 Query: (1, l, r) - Replace A[i] with
(i-l+1)*A[l] for each index i, where l <= i <= r.
• Type 2 Query: (2, l, r) - Calculate the sum of the
elements in A from index l to index r.
Find the sum of answers to all type 2 queries. Since
answer can be large, return it modulo 109+7. */

//Sample Test Cases
/*Sample Input 1
7
1
4
5
1
6
7
8
5
1 1 6
1 1 5
2 5 5
2 3 4
2 3 3
Sample Output 1
60
Sample Output Description 1
Here, n = 7
A = [1, 4, 5, 1, 6, 7, 8]
q = 5
queries = [[1, 1, 6], [1, 1, 5], [2, 5, 5], [2, 3, 4], [2, 3, 3]]
for query 1 -> (1, 1, 6)
Applying the operation on subarray from index 1 to
6, A becomes, A = [1, 4, 8, 12, 16, 20, 24]
for query 2 -> (1, 1, 5)
Applying the operation on subarray from index 1 to
5, A becomes, A = [1, 4, 8, 12, 16, 20, 24]
for query 3 -> (2, 5, 5)
calculate sum of array from index 5 to 5 -> sum =
A[5] = 20 */


import java.util.*;
public class SumOfAns {
    static final long mod = 1000000007;  //For Big Test case modddd
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //Size of arr
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int q = input.nextInt();
        //grid sizing according to question
        int[][] grid = new int[q][3];
        for(int i=0; i<q; i++){
            for(int j=0; j<3; j++){
                grid[i][j] = input.nextInt();
            }
        }

        int sum = 0;           //This will be final answer
        for(int i=0; i<q; i++){
            if(grid[i][0]==1){
                int l = grid[i][1];  //Second element of row
                int r = grid[i][2];  //Last element of row
                for(int j=l; j<r; j++){
                    arr[j] = (j-l+1)*arr[l];    //Given of query 1....
                }
            } else {
                int currSum = 0;   //It will store current sum for each query2
                int l = grid[i][1];
                int r = grid[i][2];
                for(int j=l; j<=r; j++){
                    currSum = currSum+arr[j];  //Given for query 2.....
                }
                sum = sum +currSum;   //add current sum to final answer....
            }
        }
        System.out.println(sum);
    }
}

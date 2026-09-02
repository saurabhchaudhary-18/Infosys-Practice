/*A group of N people are seated around a circular
table to play a game.
The game involves jumping from one chair to
another. Each person sitting on chair i can jump A[i]
chairs to either the right or left in one jump where 0
< i < N+1.
Bob, sitting on chair X, needs to reach chair Y, where
the escape door is located.
Find the minimum number of jumps required to
reach chair Y from chair X. If this is impossible using
the given jump distances, then return -1.
Input Format
The first line contains an integer, N, denoting the
number of people playing the game.
The next line contains an integer, X, denoting the
chair on which Bob is seated.
The next line contains an integer, Y, denoting the
chair which Bob wants to reach.
Each line i of the N subsequent lines (where 1 ≤ i ≤
N) contains an integer describing A[i] is the number
of chairs the person sitting in chair number i can
jump either right or left.
Constraints
1 <= N <= 10^5
1 <= X <= N
1 <= Y <= N
1 <= A[i] <= 10^5
Sample Test Cases
Case 1
Input:
5
5
1
1
2
3
2
4
Output: 1 */

import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print(jumping(x,y,arr));

    }
    public static int jumping(int x, int y, int[] arr){
        x--;
        y--;
        int n = arr.length;
        if(x==y){    //already sitting yhat target postiion
            return 0;
        }
        Queue<Integer> q = new LinkedList<>();
        int[] distance = new int[n];
        Arrays.fill(distance,-1);
        q.offer(x);
        distance[x] = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            int jump = arr[curr];
            int right = (curr+jump)%n;
            if(distance[right]==-1){
                distance[right] = distance[curr]+1;
                if(right==y){
                    return distance[right];
                }
                q.offer(right);
            }
            int left = (curr-jump+n)%n;
            if(distance[left]==-1){
                distance[left] = distance[curr]+1;
                if(left==y){
                    return distance[left];

                }
                q.offer(left);
            }
        }
        return -1;
    }
}

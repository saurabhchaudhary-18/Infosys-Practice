/*You have an oil tank with a capacity of C litres that
can be bought and sold by N people. The people
are standing in a queue are served sequentially in
the order of array A.
Some of them want to sell a litre of oil and some of
them want to buy a litre of oil and A describes this.
Here, A[i] = 1 denotes that the person wants to sell
a litre of oil and A[i] = -1 denotes that the person
wants to buy a litre of oil.
When a person wants to sell a litre of oil but the
tank is full, they cannot sell it and become upset.
Similarly, when a person wants to buy a litre of
oil but the tank is empty, they cannot buy it and
become upset. Both these cases cause disturbances.
You can minimize the disturbance by filling the tank
initially with a certain X litres of oil.
Find the minimum initial amount of oil X that results
in the least number of disturbances.
Input Format
The first line contains an integer, N, denoting the
number of elements in A.
The next line contains an integer, C, denoting the
capacity of the tank.
Each line i of the N subsequent lines (where 0 ≤ i <
N) contains an integer describing A[i].
Constraints
1 <= N <= 10^5
1 <= C <= 10^5
-1 <= A[i] <= 1
Sample Test Cases
Case 1
Input:
3
3
-1
1
1 */

import java.util.*;
public class OilTankCapacity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =input.nextInt();
        }
        int initial = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(sum!=c){
                sum = sum + arr[i];
            }
            initial = Math.min(initial, sum);
        }
        System.out.println((-1)*initial);
    }
}

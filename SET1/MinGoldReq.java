/* In the enchanted land of Arithmia, two young adventurers, Mira and Taran, discovered a hidden map 
while exploring the ruins of an old wizard’s tower. The map led to the legendary Vault of Efficiency, said to 
hold the secrets of making anything with the least effort—and the least gold. At the vault’s entrance, they 
found a glowing tablet with an inscription: 
“Only those who can find the path with least gold coins  to treasure may enter”  
Our task is to help the friends to solve the puzzle and find the Minimum gold coins required to enter.    
If it is not possible to form the Taget  using the given gold coins, return -1. 
Examples:   
Input: goldcoins[] = [25, 10, 5], Target= 30 
Output: 2 
Explanation : Minimum 2 goldcoins needed, 25 and 5   
Input: goldcoins[]  = [9, 6, 5, 1], sum = 19 
Output: 3 
Explanation: 19 = 9 + 9 + 1 
Input: goldcoins[] = [5, 1], sum = 0 
Output: 0 
Explanation: For 0 sum, we do not need a coin 
Input: goldcoins[] = [4, 6, 2], sum = 5 
Output: -1 
Explanation: Not possible to make the given Target. */

import java.util.*;
public class MinGoldReq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] gold = new int[n];
        for(int i=0; i<n; i++){
            gold[i] = input.nextInt();
        }
        int target = input.nextInt();
        if(target==0){
            System.out.println(0);
            return;
        }
        n--;
        Arrays.sort(gold);
        int cnt = 0;
        while(n>-1){
            if(target>gold[n]){
                target = target - gold[n];
                cnt++;
                System.out.println("cnt"+cnt);
            } else if(target<gold[n]){
                n--;
            } else {
                cnt++;
                break;
            }
        }
        if(n==-1){
                System.out.println(n);
            } else {
                System.out.println(cnt);
            }
        
    }
}

/*A company ABC has N employees.
For some reason, the company’s building is a bit
weird.
• It has one office on each floor and in each
office works one employee.
• Each employee i works on the ith floor and
has skill Ai.
• Each employee can belong to at most one
team.
• Each team should have employees working
in consecutive floors from i to j. In other words,
the teams should be divided in such a way that no
employee of one team can walk into the project
space of another team.
ABC uses a metric which is called the expert
number which is calculated as the sum of all the
absent expert values from each team of employees.
The absent expert value of each team is the first skill
starting from 0 which is not present in the team.
It is given that a bigger expert number is a better
expert number. Hence, you need to divide the
employees into teams such that the company’s
expert number is as large as possible.
Find the maximum expert number that can be
obtained.
Sample Input 1
4
0
2
1
1
Sample Output 1
3
Sample Output Description 1
Here, N = 4
A = [0, 2, 1, 1]

We can divide the employees in the following teams
-> [0, 2, 1], [1] 
10
0 1 0 1 1 0
3 2
1 0
*/

import java.util.*;
public class ExpertTeam {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        if(n==1){
            System.out.println(1);
            return;
        }
        ArrayList<Integer> team = new ArrayList<>();
        int expert = 0;

        for(int x : arr){
            if(!team.contains(x)){  //Prevent conflict of employee 
                team.add(x);
            } else {
                expert = expert + team.size();
                team.clear();     //clearing for next team allocation
                team.add(x);
            }
        }
        if(team.size()!=1){
            expert = expert+team.size();
            //if last have 1 member .. it has 0 value given in TestCase 1
        }
        System.out.println(expert);
    }
}

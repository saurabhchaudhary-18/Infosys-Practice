package SET1;
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
Example 4:
Input: s = "([])"
Output: true
 */

import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int so = 0;
        int co = 0;
        int ro = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                co++;
            } else if(ch==')'){
                co--;
            } else if(ch=='{'){
                ro++;
            } else if(ch=='}'){
                ro--;
            } else if(ch=='['){
                so++;
            } else {
                so--;
            }
            if(co<0 || so<0 || ro<0){
                break;
            }
        }
        if(co!=0 || ro!=0 || so!=0){
            System.out.println("Not valid");
        } else {
            System.out.println("Valid");
        }
    }
}

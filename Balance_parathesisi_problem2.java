// Inputs
// 3
// {([])}
// ()
// ([]

// outputs
// balanced
// balanced
// not balanced

import java.util.*;
public class Balance_parathesisi_problem2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while(test-->0){
            String str = sc.next();
            Stack<Character> s = new Stack<>();
            char ch = '\0';
            int i = 0;
            boolean flag = true;
            while(i<str.length()){
                ch = str.charAt(i);
                if(ch=='(' || ch== '[' || ch == '{'){
                    s.push(ch);
                }
                else if(!s.isEmpty()){
                        if(ch==')' && s.peek()=='('){
                            s.pop();
                        }
                        else if(ch=='}' && s.peek()=='{'){
                            s.pop();
                        }
                        else if(ch==']' && s.peek()=='['){
                            s.pop();
                        }
                        else{
                            flag = false;
                            break;
                        }
                    }
                else{
                    flag =false;
                    break;
                }
                
                i++;
            }
            if(flag && s.isEmpty()){
                System.out.println("balanced");
            }
            else{
                System.out.println("not balanced");
            }
            
        }
    }
}
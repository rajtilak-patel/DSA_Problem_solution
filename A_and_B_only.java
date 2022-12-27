// inputs 
// ?ba??b

// outputs 
// ababab

import java.util.*;
public class A_and_B_only{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='?'){
                if((i+1>=n || s.charAt(i+1) != 'a') && ((i-1)<0 || s.charAt(i-1) !='a')){
                    s = s.substring(0,i)+'a'+s.substring(i+1);
                } 
                else{
                    s = s.substring(0,i)+'b'+s.substring(i+1);
                }
            }
        }
        System.out.println(s);
    }
}
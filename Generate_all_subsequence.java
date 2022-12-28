/**
 * Generate_all_subsequence
 * 4
   abcd

   output
    a
    ab
    abc
    abcd
    abd
    ac
    acd
    ad
    b
    bc
    bcd
    bd
    c
    cd
    d
 */

import java.util.*;
public class Generate_all_subsequence
{   
     public static void print(StringBuilder output){
         System.out.println(output.toString());
     }
    public static void subString(String str,int index, StringBuilder output){
        if(output.length() !=0){
             print(output);
           // return;
        }
        
        if(index==str.length()){
            return;
        }
        // for(int i=0;i<str.length();i++){
        //     subString(str,index+1,output);
        //     output.deleteCharAt(output.length());
        //     subString(str,index+1,output);
        // }
        for(int i=index;i<str.length();i++){
             output.append(str.charAt(i));
             subString(str,i+1,output);
             output.deleteCharAt(output.length()-1);
         }
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String str = sc.next();
	    StringBuilder output = new StringBuilder();
		subString(str,0,output);
	}
}
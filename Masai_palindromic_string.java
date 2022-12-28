// inputs
/*
 * thisracecarisgood
 * 
 * hints 
 * The given string contains a palindromic substring which is, "racecar" and it is of largest length(7) among all other palindromic substrings.
   Hence the output is 7
   
 * outputs
 * 7
 * 
 */

public class Masai_palindromic_string {
    public static void masaiPalindromicSubstring(String str){
        //write your code here
        int max = 1;
        for(int i=0;i<str.length();i++){
            for(int j=i+1; j<str.length(); j++){
                
                if(mirror(str,i,j)){
                  max =(j-i+1>max)? j-i+1 : max;
                }
        
            } 
            
        }
        System.out.println(max);
      }
      
      public static boolean mirror(String str, int i,int j){
          int start = i;
          int end = j;
          while(start<end){
             if(str.charAt(start)==str.charAt(end)){
                 start++;
                 end--;
             }
             else{
                 break;
             }
          }
          return !(start<end);
      }
}


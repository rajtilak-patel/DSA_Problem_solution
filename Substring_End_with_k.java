//inputs
// 1
// 4
// aman
// a

// output 4
// Hints
// In the given sample test case, the value of K = 'a'. The total number of substrings of A, which are ending at K = 'a', are {a,ama,ma,a}. Therefore, the required output is 4.


import java.util.*;
public class Substring_End_with_k{
 
  public static void solve(String a, char k){
    //write your code here
    int count = 0;
    for(int i=0;i<a.length();i++){
        for(int j=i;j<a.length();j++){
            if(check(i,j,a,k)){
                count++;
            }
        }
    }
    System.out.println(count);
  }
  public static boolean check(int i ,int j, String a,char m){
      boolean flag = false;
          if(a.charAt(j)==m){
              flag = true;
          }
      return flag;
  }
  
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();
      while(test>0){
           int n = sc.nextInt();
           String str = sc.next();
           char c = sc.next().charAt(0);
          // System.out.println("c = "+c);
           solve(str,c);
          test--;
      }
     
  }
}  

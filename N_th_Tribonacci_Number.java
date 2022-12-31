/*inputs
1
4
 * 
 * output
 * 4
 * 
 * T_3 = 0 + 1 + 1 = 2
  T_4 = 1 + 1 + 2 = 4
 * 
 * Description :- The Tribonacci sequence Tn is defined as follows:
T0= 0, T1= 1, T2= 1, and Tn+3= Tn+ Tn+1+ Tn+2 for n >= 0.

Givenn, return the value of Tn mod 10^9+7.
 */

import java.util.*;
public class N_th_Tribonacci_Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long a[] = new  long[51];
           long mod = 1000000000 + 7;
        a[0]= 0;
        a[1] = 1;
        a[2] = 1;
        int a0 = 0, a1 = 0, a2 = 1, a3 = 2;
        for(int i = 3; i<= 50; i++){
            a[i] = (a[i-3] + a[i-2] + a[i-1]);
            // a[i] %= mod;
        }
        
        int t =  sc.nextInt();
        while(t>0){
             int n = sc.nextInt();
             long  x = (a[n]);
            System.out.println(x);
            t--;
        }
    }
}
/*input
 * 4 2
 * 
 * output
 * 13.00
 * 
 *  T(x) = 1 + x + x^2/2! + x^3/3! +......... +x^n/n!  
 */
import java.util.*;
public class EtoPowerX{
    public static double fact(int r){
        int fact = 1;
        for(int i=1;i<=r;i++){    
          fact = fact*i;    
       }
       return fact;
    }
    public static double eToPowerX(int x,int r){
        if(r==0){
            return 1;
        }
        double val = Math.pow(x,r);
        double ans = val/fact(r)+eToPowerX(x,r-1);
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int r = sc.nextInt();
        double ans = eToPowerX(x,r);
        System.out.printf("%.4f",ans);
    }
}
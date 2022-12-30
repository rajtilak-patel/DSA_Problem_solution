/*
 * inputs
 * 1
6 5
3 1 7 4 2
2 1 3 1 1
1 2 2 1 8
2 2 1 5 3
2 1 4 4 4
5 2 7 5 1
 * 
 * outputs
 * 32

 */
import java.util.*;
public class SpringBoard{
    public static int inc = 0;
    public static int springBoard(int i,int j ,int arr[][],int dp[][]){
        if(i>=arr.length || j<0 || j>=arr[0].length){
            return 0;
        }
       // int inc = 10;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        inc =  Math.max(springBoard(i+1,j,arr,dp), springBoard(i+1,j+1,arr,dp));
        inc = arr[i][j] + Math.max(inc,springBoard(i+1,j-1,arr,dp));
        return dp[i][j]=inc;
    }
  
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int arr[][] = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            int dp[][] = new int[n][m];
            int max = 0;
            for(int j=0;j<m;j++){
                 max =  Math.max(max,springBoard(0,j,arr,dp));
            }
            System.out.println(max);
          //  System.out.println(inc);
            test--;
        }
    }
}
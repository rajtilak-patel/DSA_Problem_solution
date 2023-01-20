// inputs
//  * 9
// 1 2 3 4 5 6 7 8 9
// 5

// output
/*
 * yes
 * 
 */


import java.util.*;
public class Sum_existe_or_not{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        
        boolean [][]dp = new boolean[n+1][tar+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j] = true;
                }
                else if(i==0){
                    dp[i][j] = false;
                }
                else if(j==0){
                    dp[i][j] = true;
                }
                else{
                    // not consider
                    if(dp[i-1][j]==true){
                        dp[i][j] = true;
                    }
                    else{
                        int val = arr[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]==true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        if(dp[arr.length][tar]){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
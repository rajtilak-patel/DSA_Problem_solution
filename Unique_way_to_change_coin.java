// inputs 
// 4 3
// 1 2 3

// outputs 4
// Hints
// Sample Input 1 Explanation

// There are four ways to make the change for n = 4using coins with values given by:

// A = [1,2,3] :

// 1 .{1,1,1,1}

// 2. {1,1,2}

// 3. {2,2}

// 4. {1,3}

// thus we print 4 as answer.


import java.util.*;
public class Unique_way_to_change_coin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        long dp[] = new long[coin+1];
        dp[0] = 1;
        
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<dp.length;j++){
                dp[j] = dp[j]+dp[j-arr[i]];
            }
        }
        System.out.println(dp[coin]);
    }
}
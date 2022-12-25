
import java.util.*;
class Generate_permutation{
    public static void F(int x, int[] arr,int[] ans,int n, ArrayList<Integer> dp){
        if(x==n){
            for(int i=0;i<n;i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            return;
        }
        
        for(int i=0;i<n;i++){
            if(dp.contains(i) == true)
            continue;
            
            dp.add(i);
            ans[x] = arr[i];
            F(x+1, arr, ans, n, dp);
            dp.remove(dp.size()-1);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = 1;
        
        while(t!= 0){
        int n = 3;
        int res = 0;
        
        int arr[] = {1,2,3};
        int ans[] = new int[n];
        // for(int i = 0;i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        
        // combinationSum(arr,n);
        // if(n%4 == 0)
        ArrayList<Integer> dp = new ArrayList<>();
        F(0, arr, ans, n, dp);
        // System.out.println(res);
        t-=1;
        }
    }
}
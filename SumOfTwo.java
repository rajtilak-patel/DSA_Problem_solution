import java.util.*;
public class SumOfTwo {
    public static ArrayList<Integer> ans = new ArrayList<Integer>();
	public static ArrayList<Integer> findArraySum(int[] a, int n, int[] b, int m) {
		// Write your code here.
        
        int i = n-1;
        int j = m-1;
        
        int carry = 0;
        while(i>=0 && j>=0){
            int sum = a[i]+b[j]+carry;
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            i--;
            j--;
        }
        while(i>=0){
            int sum = a[i]+carry;
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            i--;
        }
        while(j>=0){
            int sum = b[j]+carry;
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            j--;
        }
        while(carry!=0 ){
             int sum = carry;
             carry = sum/10;
             sum = sum%10;
             ans.add(sum);
        }
        return ans;
	}
	public static void main(String args[]){
	    int arr1[] = {1,2,3,4};
	    int arr2[] = {6};
	    
	    int n = 4;
	    int m = 1;
	    
	    findArraySum(arr1,n,arr2,m);
        // reverse(ans);
        // for(int i=0;i<ans.size();i++){
        //     System.out.println(ans.get(i));
        // }
        for(int k=ans.size()-1;k>=0;k--){
            System.out.print(ans.get(k)+" ");
        }
	}
}
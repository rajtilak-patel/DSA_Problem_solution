/*inputs
6 3
2 3 3 3 6 9
output 3
*/
import java.util.*;
public class Number_of_occurence_binarySearch{
  //  lower bound
    public static int lowerSearch(int arr[],int k){
        int s =0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        int ans = -1;
        while(s<=e){
            if(arr[mid]==k){
                ans = mid;
                e = mid-1;
            }
            if(arr[mid]<k){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    //upper bound
     public static int upperSearch(int arr[],int k){
        int start = 0;
        int end = arr.length-1;
       // int mid = s+(e-s)/2;
         int result = -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=k )
            {
                start = mid+1;
            }
            else
            {
                end=mid-1;
            }
             if(arr[mid]==k)
            {
                result=mid;
            }
        }
        return result;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       int ans = lowerSearch(arr,k);
      // System.out.println(ans);
       int ans1 = upperSearch(arr,k);
     //  System.out.println(ans1);
      int result = (ans1-ans)+1;
      System.out.println(result);
        
    }
}
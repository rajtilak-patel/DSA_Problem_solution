
import java.util.*;
public class Search_sorted_and_rotate_array{
    public static int search(int arr[],int k){
        int pivotElement = pivot(arr);
        if(k >=arr[pivotElement] && k<=arr[arr.length-1]){
            return binarySearch(arr,pivotElement,arr.length-1,k);
        }
        else{
             return binarySearch(arr,0,pivotElement-1,k);
        }
    }
        public static int pivot(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        while(s<e){
            mid = s+(e-s)/2;
            if(arr[0]<=arr[mid]){
                s = mid+1;
            }
            else{
                e = mid;
            }
       }
     //   System.out.println("ratjtilak "+ s);
        return s;
    }
    public static int binarySearch(int arr[],int s,int e,int k){
        int mid = s+(e-s)/2;
        while(s<=e){
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       int ans = search(arr,k);
      // int ans = binarySearch(arr,k);
      System.out.println(ans);
        
    }
}

//20 12 
//18 19 21 22 23 24 29 30 -10 -9 -8 -7 -6 -4 -3 -1 7 10 11 12
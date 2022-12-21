
    

public class circuler_binarySearch
{
    public static int pivot(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        System.out.println("ratjtilak "+ s);
        while(s<e){
            mid = s+(e-s)/2;
            if(arr[0]<=arr[mid]){
                s = mid+1;
               // return 1;
            }
            else{
                e = mid;
            }
        }
        System.out.println("ratjtilak "+ s);
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
	public static void main(String[] args) {
		int arr[] = {18,19,21,22, 23, 24, 29, 30 ,-10, -9 ,-8 ,-7, -6, -4, -3, -1, 7, 10, 11, 12};
		int ans = binarySearch(arr,0,arr.length-1,12);
		System.out.println("ratjtilak "+ ans);
	}
}

//20 12 
//18 19 21 22 23 24 29 30 -10 -9 -8 -7 -6 -4 -3 -1 7 10 11 12
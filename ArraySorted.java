
public class ArraySorted
{
    public static boolean isSorted(int arr[],int start,int n){
    
        if(n==0 || n==1){
            return true;
        }
        if(arr[start]>arr[start+1]){
            return false;
        }
        else{
        
          boolean remain = isSorted(arr,start+1,n-1);
          return remain;
            
        }
    }
	public static void main(String[] args) {
		int arr[] = {2,3,5,7,9,11};
		int n = 6;
		
		boolean ans = isSorted(arr,0,n);
		
		System.out.println(ans);
	}
}
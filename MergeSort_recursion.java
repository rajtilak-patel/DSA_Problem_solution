
// merge sort implemention code usin recursion
// int arr[] = {8,5,2,9,7,1};
public class MergeSort_recursion
{
    public static void merge(int arr[] , int start , int end){
        int mid = (start+end)/2;
        
        int arr1[] = new int[mid-start+1];
        int arr2[] = new int[end-mid];
        int k = start;
        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr[k++];
        }
         k = mid+1;
         for(int i=0;i<arr2.length;i++){
            arr2[i] = arr[k++];
        }
        
        int i=0;
        int j = 0;
        k = start;
        
        while(i<arr1.length && j<arr2.length ){
            if(arr1[i]<arr2[j]){
                arr[k++] = arr1[i++];
            }
            else{
                 arr[k++] = arr2[j++];
            }
        }
        
        while(i<arr1.length){
            arr[k++] = arr1[i++];
        }
        
        while(j<arr2.length){
              arr[k++] = arr2[j++];
        }
    }
    public static void mergeSort(int arr[],int s,int e){
        if(s>=e){
            return ;
        }
        int mid = s+(e-s)/2;
        
        // left part sort
        mergeSort(arr,s,mid);
        
        // rigth part sort
        mergeSort(arr,mid+1,e);
        
        // merge two sorted array
        
        merge(arr , s, e);
    }
	public static void main(String[] args) {
	  int arr[] = {8,5,2,9,7,1,78,45,95,41,23,65,47,84,56,41,23,14,58,78,65,41};
	  int n = 22;
	  
	  mergeSort(arr,0,n-1);
	  
	  for(int i=0;i<n;i++){
	      
	    System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	}
}

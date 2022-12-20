
// queckSort implimention using recursion
public class QuickSort_recursion
{
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[],int s,int e){
        int pivot = arr[s];
        
        int count = 0;
        
        for(int i=s+1;i<=e;i++){
            if(pivot>arr[i]){
                count++;
            }
        }
        
        int pivotIndex = s+count;
        swap(arr,pivotIndex,s);
        
        int i=0;
        int j=e;
        
        while(i<pivotIndex && j>pivotIndex){
            
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]> pivot){
                j--;
            }
            
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
            }
        }
        return pivotIndex;
    }
    public static void queckSort(int arr[],int s,int e){
        // base case :
        if(s>=e){
            return;
        }
        
        int p = partition(arr,s,e);
        
        // left part queckSort
        queckSort(arr,s,p-1);
        
        // right part queckSort
        queckSort(arr,p+1,e);
            
    }
	public static void main(String[] args) {
		int arr[] = {3,5,1,8,2,4};
		
		int n = 6;
		
		queckSort(arr,0,n-1);
		
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
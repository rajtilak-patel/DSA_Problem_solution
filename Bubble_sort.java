
public class Bubble_sort
{
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int arr[],int n){
        // base case :
        if(n==0 || n==1){
            return ;
        }
        // solve case 1 than recursion solve automatically;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        
        bubbleSort(arr,n-1);
            
    }
	public static void main(String[] args) {
		int arr[] = {5,4,6,8,1,2,8};
		 int n = 7;
		 
		 bubbleSort(arr,n);
		 
		 for(int i=0;i<n;i++){
		     System.out.print(arr[i]+" ");
		 }
		 System.out.println();
	}
}
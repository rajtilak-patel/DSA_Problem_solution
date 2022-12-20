
public class Small_element_left
{
	public static void main(String[] args) {
	 int arr[] = {39,27,11,4,24,32,32,1};
	 int n = 8;
	 System.out.print("-1 ");
	 for(int i=1;i<n;i++){
	     int j ;
	     for(j=i-1;j>=0;j--){
	         
	         if(arr[j]<arr[i]){
	             System.out.print(arr[j]+" ");
	             break;
	         }
	     }
	     if(j==-1){
	         System.out.print("-1 ");
	     }
	     
	 }
	 
	    
	}
}
// 8
// 39 27 11 4 24 32 32 1
// -1 -1 -1 -1 4 24 24 -1
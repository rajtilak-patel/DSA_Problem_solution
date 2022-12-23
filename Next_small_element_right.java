
import java.util.*;
public class Next_small_element_right
{
    public static void reverse(int arr[]){
        int i=0;int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
	public static void main(String[] args) {
		int arr[] = {39,24,11,4,24,32,32,1};
		int n=8;
		
		Stack<Integer> s = new Stack<>();
		int ans[] = new int[n];
		for(int i=n-1,k=0;i>=0;i--,k++){
		    
		    while(!s.isEmpty() && s.peek() >= arr[i]){
		        s.pop(); 
		    }
		    
		    if(s.isEmpty()){
		      //  System.out.print("-1 ");
		        ans[k] = -1;
		    }
		    else{
		      //  System.out.print(s.peek()+" ");
		         ans[k] = s.peek();
		    }
		    
		    s.push(arr[i]);
		}
		reverse(ans);
		for(int l=0;l<ans.length;l++){
		    System.out.print(ans[l]+" ");
		}
	}
}
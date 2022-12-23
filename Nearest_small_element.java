
import java.util.*;
public class Nearest_small_element
{
	public static void main(String[] args) {
		int arr[] = {39,24,11,4,24,32,32,1};
		int n=8;
		
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<n;i++){
		    
		    while(!s.isEmpty() && s.peek() > arr[i]){
		        s.pop(); 
		    }
		    
		    if(s.isEmpty()){
		        System.out.print("-1 ");
		    }
		    else{
		        System.out.print(s.peek()+" ");
		    }
		    
		    s.push(arr[i]);
		}
	}
}

import java.util.*;
public class FindUnique_charecter
{
	public static void main(String[] args) {
		String str = "aabcdbc";
		int n = str.length();
		
		HashMap<Character , Integer> s = new HashMap<Character,Integer>();
		
		for(int i=0;i<n;i++){
		    Character ch = str.charAt(i);
		    
		    if(s.containsKey(ch)){
		        s.put(ch , s.get(ch)+1);
		    }
		    else{
		         s.put(ch , 1);
		    }
		}
		
		for(int i=0;i<n;i++){
		    Character ch = str.charAt(i);
		    
		    if(s.get(ch)==1){
		        System.out.println("character is "+ch);
		    }
		   
		}
		
	}
}

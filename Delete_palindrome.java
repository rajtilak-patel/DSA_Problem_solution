import java.util.*;
public class Delete_palindrome {
public static void detectPalII(int N, String str){
    //write your code here
		// Create a list
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++)
		{
			if (list.contains(str.charAt(i)))
				list.remove((Character)str.charAt(i));
			else
				list.add(str.charAt(i));
		}
		if (str.length() % 2 == 0 && list.isEmpty() 
	         	|| (str.length() % 2 == 1	&& list.size()	== 1))
			System.out.println("Possible!");
		
		else
			System.out.println("Not Possible!");
	}

    public static void main(String args[]){
     int text = 2;
     int n = 6;
     String str = "aabbcc";
     detectPalII(n,str);
    }
}    
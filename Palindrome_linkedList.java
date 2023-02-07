
import java.util.*;
// Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Palindrome_linkedList
{
    public static boolean checkPalindrom(ArrayList<Integer> arr){
        int s = 0;
        int e = arr.size()-1;
        
        while(s<=e){
           if(arr.get(s)==arr.get(e)){
               s++;
               e--;
           }
           else{
               return false;
           }
        }
        return true;
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        Node temp = head;
        
        while(temp!= null){
            arr.add(temp.data);
            
            temp = temp.next;
        }
        
        return checkPalindrom(arr);
    }    

  
}


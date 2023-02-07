
class Pallindrom_linkedList_2
{
    public static Node reverse(Node slowData){
        Node curr = slowData;
        Node prev = null;
        Node forward = null;
        
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public static Node getMiddle(Node head){
         Node slow = head;
        Node fast = head.next;
         while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
     
        // step 1 complete
        Node middle =  getMiddle(head);
        
        // reverse
        Node temp = middle.next;
        middle.next =  reverse(temp);
        
        // compare 
        Node curr1 = head;
        Node curr2 = middle.next;
        
        while(curr2 != null){
            if(curr1.data != curr2.data){
                return false;
            }
             curr1 = curr1.next;
             curr2 = curr2.next;
        }
        
        return true;
    }    
}
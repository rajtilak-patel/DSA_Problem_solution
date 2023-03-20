
class AddToLinkedlist{
    public Node addTwoLinkedList(Node head1,Node head2){
      //write your code here.
     Node dummy = new Node(0);
     Node temp = dummy;
     int carry = 0;
      while(head1 != null || head2 != null || carry == 1){
          int sum = 0 ;
          if(head1 != null){
               sum += head1.data;
               head1 = head1.next;
          }
           if(head2 != null){
               sum += head2.data;
               head2 = head2.next;
          }
          
          sum += carry;
          
          carry = sum/10;
          
          Node node = new Node(sum%10);
          
          temp.next = node;
          temp = temp.next;
          
      }
      return dummy.next;
    }
  }
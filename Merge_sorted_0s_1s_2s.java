

    // Following is the linked list node structure
    
    class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}


public class Merge_sorted_0s_1s_2s {
	public static Node<Integer> sortList(Node<Integer> head) {
        // Write your code here

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        Node<Integer> temp = head;

        while(temp != null){
            if(temp.data==0){
                zeroCount++;
            }
            else if(temp.data == 1){
                oneCount++;
            }
            else if(temp.data ==2 ){
                twoCount++;
            }
            temp=temp.next;
        }

        temp = head;

        while(temp !=null ){
            if(zeroCount != 0){
                temp.data = 0;
                zeroCount--;
            }
            else if(oneCount != 0){
                 temp.data = 1;
                 oneCount--;
            }
            else if(twoCount != 0){
                temp.data = 2;
                twoCount--;
            }
            temp = temp.next;
        }

        return head;
	}
}
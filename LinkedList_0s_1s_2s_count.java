// public class LinkedList_0s_1s_2s_count {
    
// }
// class LinkedList_0s_1s_2s_count
// {
//     //Function to sort a linked list of 0s, 1s and 2s.
//     static Node segregate(Node head)
//     {
//         // add your code here
//         int zeroCount =0;
//         int oneCount = 0;
//         int twoCount = 0;
        
//         Node temp = head;
        
//         while(temp != null){
//             if(temp.data ==0){
//                 zeroCount++;
//             }
//             else if(temp.data == 1){
//                 oneCount++;
//             }
            
//             else if(temp.data== 2){
//                 twoCount++;
//             }
//             temp = temp.next;
//         }
        
//         temp = head;
        
//         while(temp != null){
//             if(zeroCount != 0){
//                 temp.data = 0;
//                 zeroCount--;
//             }
//             else if(oneCount != 0){
//                 temp.data = 1;
//                 oneCount--;
//             }
//             else if(twoCount != 0){
//                 temp.data = 2;
//                 twoCount--;
//             }
//             temp = temp.next;
//         }
//         return head;
//     }
// }

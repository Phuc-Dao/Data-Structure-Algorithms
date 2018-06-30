/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//This needs some debugging
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      /*Creates a dummy Node to handle corner cases like when the head has to be removed or if there is only one item in the         list*/
      ListNode dummyHead = new ListNode(-1);
      //Connects the dummy to the next head 
      dummyHead.next = head;
      //Start end at orig head
      ListNode end = head;
      //start curr at listnode
      ListNode curr = dummyHead;
      head = dummyHead;
      
      //makes a gap of n spaces between current and head
      for(int i =0; i <n; i++){
        //Check if the elements are to big
        try{
          end = end.next;
        }catch(Exception e){
          //Catch the exception
          System.out.println(e);
          return null;
        }
      }
      //stops the end ref at null
      while(end != null){
        curr = curr.next;
        end = end.next;
      }
      //walks around the target node
      curr.next = curr.next.next;
      head = head.next
      return head;
  }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode temp = head;
        Stack<Integer> stck = new Stack<>();

        while(temp != null){

            stck.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(!stck.isEmpty()){

            temp.val = stck.pop();
            temp = temp.next;
        }

        return head;
    }
}

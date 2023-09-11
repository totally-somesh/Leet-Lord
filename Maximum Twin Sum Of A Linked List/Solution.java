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
    public int pairSum(ListNode head) {
        
        ListNode temp = head;
        int count = 0;

        while(temp != null){

            count++;
            temp = temp.next;
        }

        int [] arr = new int [count];
        int sum = 0;
        int index = 0;
        int maxSum = 0;

        temp = head;
        while(temp != null){

            arr[index++] = temp.val;
            temp = temp.next;
        }

        for(int i=0; i<arr.length; i++){

            sum = arr[i] + arr[arr.length-(i+1)];

            maxSum = Math.max(maxSum, sum);
        }
     
        return maxSum;

    }
}

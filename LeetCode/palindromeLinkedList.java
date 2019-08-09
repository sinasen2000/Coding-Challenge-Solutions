/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        
        while(head != null){
            if(stack.peek() != head.val){
                return false;
            }
            stack.pop();
            head = head.next;
        }
        return true;
    }
}
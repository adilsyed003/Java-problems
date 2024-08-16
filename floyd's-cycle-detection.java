//also called Tortise hare problem
class Solution {
        public int square(int a){
            int sum =0;
            while(a!=0){
                sum += (a%10)*(a%10);
                a /= 10;
            }
            return sum;
        }
    public boolean isHappy(int n) {
        int slow  = n;
        int fast = square(n);
        while(fast!=1 && fast!=slow){
            slow = square(slow);
            fast = square(square(fast));
        }
        return fast==1;
    }
}

//second problem....

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
        return false;

        ListNode temp = head.next;
        while(head!=null && temp!=null && temp.next!=null){
            head = head.next;
            temp = temp.next.next;
            if(head == temp) return true;
        }
        return false;
    }
}

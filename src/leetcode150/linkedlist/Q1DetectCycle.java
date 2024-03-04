package leetcode150.linkedlist;

public class Q1DetectCycle {



    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }

        return false;

    }
}

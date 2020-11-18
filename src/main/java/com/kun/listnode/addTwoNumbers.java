package com.kun.listnode;

/**
 * @Description
 * 2. Add Two Numbers
 * @Author zhaokun
 * @Date 2020/11/18
 * @Version 1.0
 **/
public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        ListNode reverse = reverse(head);
        System.out.println(head.val);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int temp = 0;
        int l = l1.val + l2.val;
        if(l >= 10) {
            head = new ListNode(l - 10);
            temp = 1;
        } else {
            head = new ListNode(l);
        }
        current = head;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null || l2 != null) {
            int i = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + temp;
            if(i > 9) {
                current.next = new ListNode(i - 10);
                temp = 1;
            } else {
                current.next = new ListNode(i);
                temp = 0;
            }
            current = current.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(temp == 1){
            current.next = new ListNode(1);
        }
        return head;
    }
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

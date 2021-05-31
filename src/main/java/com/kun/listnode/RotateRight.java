package com.kun.listnode;

/**
 * @Description
 * 61. Rotate List
 * 链表旋转
 * @Author zhaokun
 * @Date 2021/5/28
 * @Version 1.0
 **/
public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        // 获取链表长度
        int length = 0;
        ListNode calculate = head;
        while (calculate != null) {
            calculate = calculate.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }
        k = length - k;
        ListNode current = head;
        ListNode prev = null;
        while (k > 0) {
            prev = current;
            current = current.next;
            k--;
        }

        prev.next = null;
        ListNode fHead = head;
        head = current;
        while (current.next != null) {
            current = current.next;
        }
        current.next = fHead;
        return head;
    }

}

package com.kun.listnode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/3/26
 * @Version 1.0
 **/
public class SwapPairs {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(null);
        objects.add(null);
        System.out.println(objects.size());
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null){

            //just the swapping value of nodes
            int temp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;

            //move next to next
            curr = curr.next.next;
        }
        return head;
    }

    public static ListNode swapPairs2(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode current=head.next;
        ListNode newHead=current;

        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            if(next==null){
                prev.next=null;
                current=next;
            }
            else{
                prev.next=(next.next==null)? next: next.next;
                prev=next;
                current=next.next;
            }
        }
        head=newHead;
        return head;
    }

    public static void swapPairs3(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null){
            ListNode c = current.next;
            current.next = prev;
            prev = current;
            current = c;
        }
        head = prev;
    }

    public static ListNode addNode(ListNode head, int data) {
        if (head == null) {
            head = new ListNode(data);
        }
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(data);

        return head;
    }
}

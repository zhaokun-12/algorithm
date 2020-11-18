package com.kun.stack;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/11/18
 * @Version 1.0
 **/
public class MinStack {
    private int[] data;
    private int now;
    /** initialize your data structure here. */
    public MinStack() {
        data = new int[10];
        now = -1;
    }

    public void push(int x) {
        if(now >= data.length - 1){
            resize();
        }
        data[++now] = x;
    }

    public void pop() {
        data[now--] = 0;
    }

    public int top() {
        return data[now];
    }

    public int getMin() {
        if (now < 0){
            throw new RuntimeException("栈中没有数据");
        }
        int min = data[0];
        for (int i = 0; i <= now; i++) {
            if(data[i] < min){
                min = data[i];
            }
        }
        return min;
    }

    private void resize(){
        int old = data.length;
        int newLength = old << 1;
        if (newLength < 0){
            newLength = Integer.MAX_VALUE;
        }
        int[] temp = new int[newLength];
        System.arraycopy(data, 0, temp, 0, old);
        this.data = temp;
    }
}

package com.kun.array;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

/**
 * @Description
 * 852. 山脉数组的峰顶索引
 * @Author zhaokun
 * @Date 2021/6/15
 * @Version 1.0
 **/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {

        int[] ints = {1, 3, 4, 2};
        PeakIndexInMountainArray peakIndexInMountainArray = new PeakIndexInMountainArray();
        int i = peakIndexInMountainArray.peakIndexInMountainArray(ints);
        System.out.println(i);
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        String expression = "10 * 2 + 6 / (3 - 1)";
        try {
            Object eval = scriptEngine.eval(expression);
            String s = String.valueOf(eval);
            System.out.println(s);
        } catch (ScriptException e) {


        }
    }
    public int peakIndexInMountainArray(int[] arr) {
        return peakArray(arr, 0, arr.length - 1);
    }
    public int peakArray(int[] arr, int start, int end) {
        if (start == end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (arr[mid] < arr[mid + 1]) {
            return peakArray(arr, mid, end);
        } else if (arr[mid] < arr[mid - 1]) {
            return peakArray(arr, start, mid);
        } else {
            return mid;
        }
    }
}

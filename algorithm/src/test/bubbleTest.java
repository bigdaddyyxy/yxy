package test;

import sort.Bubble;

import java.util.Arrays;

public class bubbleTest {
    public static void main(String[] args) {
        Integer[] a = {4,5,6,1,3,2};
        Bubble.sort(a);
        System.out.println(Arrays.toString(a));


    }
}

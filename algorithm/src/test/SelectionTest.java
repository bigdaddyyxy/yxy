package test;

import sort.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {4,5,6,1,3,2,10,9};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

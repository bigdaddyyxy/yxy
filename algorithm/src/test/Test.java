package test;

import sort.*;

import java.util.Arrays;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {9,3,1,5,4,2,7,8,6};
        //int[] array = {9,3,1,5,4,2,7,8,6};
        //Insertion.sort(array);
        //Shell.sort(array);
        //Merge.sort(array);
        //Quick.QuickSort(array,0,array.length-1);
        QuickSort.sort(array);
        System.out.println(Arrays.toString(array));


    }

}

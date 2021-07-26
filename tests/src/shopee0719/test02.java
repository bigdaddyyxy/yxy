package shopee0719;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test02 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4,6,2,43,7,9};
//        quickSort(nums,0,nums.length-1);
        heapSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    public static void heapSort(int[] array){
        int length = array.length;
        for(int i=length/2-1; i>=0;i--){
            heapAdjust(array,i,length);
        }

        for(int i=length-1;i>=0;i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapAdjust(array,0,i);
        }


    }

    public static void heapAdjust(int[] array, int index, int length){
        int max = index;
        int lchild = index * 2;
        int rchild = index * 2 + 1;

        if(length > lchild && array[max] < array[lchild]) max = lchild;
        if(length > rchild && array[max] < array[rchild]) max = rchild;
        if(max != index){
            int temp = array[max];
            array[max] = array[index];
            array[index] = temp;
            heapAdjust(array,max,length);
        }


    }



//    public static void quickSort(int[] array, int low, int high) {
//        if(low<high){
//            int partition = part(array, low, high);
//            quickSort(array, low, partition-1);
//            quickSort(array,partition+1, high);
//        }
//
//
//    }
//    public static int part(int[] array, int low, int high){
//        int privlot = array[low];
//        while (low < high){
//            while(low < high && array[high]>=privlot) high--;
//            array[low] = array[high];
//            while (low < high && array[low]<privlot) low++;
//            array[high] = array[low];
//        }
//        array[low] = privlot;
//        return low;
//
//    }

}

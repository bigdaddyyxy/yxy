package sort;

import java.util.Arrays;

public class Heap {

    public static void main(String[] args) {
        int[] array = new int[]{6,4,23,1,3,7,8,2,10};
        heapSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

   public static void heapSort(int[] array){
       int len = array.length;
       //初始化堆，构造最大堆
       for (int i=(len/2 -1); i>=0;i--){
           headAdjust(array,i,len);
       }
       //将堆顶元素和最后一个元素交换，并重新调整堆
       for (int i=len-1; i>0;i--){
           int temp = array[i];
           array[i] = array[0];
           array[0] = temp;
           headAdjust(array,0,i);
       }
   }

    /**
     * 调整堆
     * @param array
     * @param index
     * @param length
     */
    static void headAdjust(int[] array, int index, int length){
       //当前节点下标
       int max = index;

       int left = 2*index;
       int right = 2*index+1;
       if (length > left && array[max] < array[left]){
           max = left;
       }
       if(length > right && array[max] < array[right]){
           max = right;
       }
       //若此节点小于左右孩子的值，就和最大值交换并调整堆
       if (max != index){
           int temp = array[index];
           array[index] = array[max];
           array[max] = temp;
           headAdjust(array,max,length);
       }
   }
}

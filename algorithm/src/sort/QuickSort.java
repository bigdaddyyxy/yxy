package sort;

public class QuickSort {
    public static void sort(Comparable[] a){
        int low = 0;
        int high = a.length-1;
        sort(a,low,high);

    }

    private static void sort(Comparable[] a, int low, int high){
        if(low >= high) return;

        int partition = partition(a, low, high);    //返回分组的分界值

        sort(a,low,partition-1);
        sort(a,partition+1,high);


    }
    public static int partition(Comparable[] a, int low, int high){
        Comparable partitation = a[low];
        while(low < high){
            while(low<high && less(partitation,a[high])) high--;
            a[low] = a[high];
            while(low<high && !less(partitation,a[low])) low++;
            a[high] = a[low];
        }
        a[low] = partitation;
        return low;
    }




    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0 ;
    }

    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

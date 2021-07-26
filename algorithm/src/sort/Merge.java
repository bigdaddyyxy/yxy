package sort;

public class Merge {

    private static Comparable[] assist;

    public static void sort(Comparable[] a){
        //初始化辅助数组
        assist = new Comparable[a.length];

        int low = 0;
        int high = a.length-1;
        sort(a,low,high);
    }

    private static void sort(Comparable[] a,int low,int high){
        if(high <= low) return;

        int mid = low + (high - low)/2 ;
        sort(a,low,mid);
        sort(a,mid+1,high);

        merge(a,low,mid,high);

    }
    private static void merge(Comparable[] a, int low, int mid, int high){
        int i = low;
        int p1 = low;
        int p2 = mid+1;
        while(p1<=mid && p2 <= high){
            if(less(a[p1],a[p2])){
                assist[i++] = a[p1++];
            }else{
                assist[i++] = a[p2++];
            }
        }
        while(p1 <= mid){
            assist[i++] = a[p1++];
        }
        while(p2<=high){
            assist[i++] = a[p2++];
        }
        for(int index=low; index<=high;index++){
            a[index] = assist[index];
        }


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

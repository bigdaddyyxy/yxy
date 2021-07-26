package sort;

//冒泡排序, 时间复杂度 O(N^2)
public class Bubble {
    public static void sort(Comparable[] a){
        for (int i= a.length-1; i>0;i--){
            for (int j=0; j<i;j++){
                if(compare(a[j],a[j+1]) ){
                    exchange(a,j,j+1);
                }
            }
        }

    }

    private static boolean compare(Comparable v, Comparable w){
        return v.compareTo(w)>0 ;
    }

    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

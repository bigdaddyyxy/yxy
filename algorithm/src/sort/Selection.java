package sort;

//选择排序， 时间复杂度O(N^2)
public class Selection {
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length-1; i++) {
            int minIndex=i;                         //记录最小元素索引
            for (int j=i+1;j<a.length;j++){
                if(compare(a[minIndex],a[j])){
                    minIndex = j;
                }
                exchange(a,i,minIndex);
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

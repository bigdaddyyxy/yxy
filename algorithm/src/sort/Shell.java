package sort;

//希尔排序
public class Shell {
    public static void sort(Comparable[] a){
        //确定增长量
        int h = 1;
        while(h < a.length/2){
            h = 2*h +1;
        }

        //排序
        while(h>=1){
            //找到待插入元素
            for (int i = h; i < a.length; i++) {
                //待插入元素
                for (int j =i;j>=h; j-=h){
                    if(greater(a[j-h],a[j])){
                        exchange(a,j,j-h);
                    }else {
                        break;
                    }
                }
            }
            h = h/2;
        }

    }

    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w)>0 ;
    }

    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

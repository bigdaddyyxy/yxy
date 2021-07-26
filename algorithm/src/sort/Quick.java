package sort;

public class Quick {

    public static void main(String[] args) {
        int[] array = new int[]{1,8,7,10,2,4,20,16};
        QuickSort(array,0,array.length-1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void QuickSort(int[] array,int low,int hight){


        //if (array.length < 1 || low < 0 || hight >= array.length || low > hight) return null;
        if(low < hight){
            int privotpos = partition(array,low,hight);
            QuickSort(array,low,privotpos - 1);
            QuickSort(array,privotpos + 1,hight);
        }

    }

    public static int partition(int[] array,int low,int hight){
        int privot = array[low];
        while(low < hight){
            while(low < hight && array[hight] >= privot) {
                --hight;
            }
            array[low] = array[hight];

            while(low < hight && array[low] <= privot) {
                ++low;
            }
            array[hight] = array[low];
        }
        array[low] = privot;
        return low;
    }
}






















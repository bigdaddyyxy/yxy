package huawei20210714;


public class test01 {

    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,0,2,1,0,2,1,1,1,4};


        int res = resolution(array);
        System.out.println(res);

    }



    public static int resolution(int[] array) {
        int startIndex = 0;
        int n = array.length;
        int count = 0;
        while (startIndex < array.length) {
            while (array[startIndex] != 0) {
                int left = startIndex;
                int right = startIndex;
                for (int i = startIndex; i < n; i++) {
                    if (array[i] != 0) {
                        left = i;
                        break;
                    }
                }
                for (int i = left; i < n; i++) {
                    if (array[i] == 0) {
                        right = i - 1;
                        break;
                    }
                    if(i==n-1 && array[i]!= 0){
                        right = i;
                    }
                }

                count++;
                push(array, left, right);
            }
            startIndex++;
        }
        return count;
    }
    public static void push(int[] array, int start, int end){
        for (int i=start;i<=end;i++){
            array[i]-=1;
        }
    }
}

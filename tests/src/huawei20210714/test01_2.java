package huawei20210714;

public class test01_2 {
    public static void main(String[] args) {
        int sum = 0, res = 0, minnum;
        int[] tmp = new int[]{0,1,2,3,0,2,1,2,1,10};
        for(int i=0; i<tmp.length; i++){
            sum += tmp[i];
        }

        while(sum > 0){
            int index = 0;
            while(index < tmp.length && tmp[index] == 0) index++;
            minnum = Integer.MAX_VALUE;
            int start = index;
            while(index < tmp.length && tmp[index] != 0){
                minnum = Math.min(minnum, tmp[index]);
                index++;
            }
            for(int j=start; j<index; j++){
                tmp[j] -= minnum;
            }
            sum -= (index - start)*minnum;
            res += minnum;
        }
        System.out.print(res);
    }
}

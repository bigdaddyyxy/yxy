package alibaba0726;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yexiangyu
 * @description
 * @apiNote
 */
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            double min = Double.MAX_VALUE;
            int res = 0;
            for (int j = 1; j <= n; j++) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                int s = sc.nextInt();
                int length = Math.abs(x1-x2);
                double price  = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2))*s;

                double L = price/ length;

                if(L < min){
                    min = L;
                    res = j;
                }
            }

            System.out.println(res);
        }
    }



}
/**
 * import java.util.Scanner;
 * import java.util.HashMap;
 * import java.util.Map;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int n = sc.nextInt();
 *         int[] array = new int[n];
 *         for(int i=0;i<n;i++){
 *             array[i] = sc.nextInt();
 *         }
 *         int q = sc.nextInt();
 *         Map<Integer,Integer> map = new HashMap<>();
 *         for(int i=0; i<q; i++){
 *             int a = sc.nextInt();
 *             int b = sc.nextInt();
 *             map.put(a-1,b-1);
 *         }
 *
 *         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
 *             int right = Math.max(entry.getKey(),entry.getValue());
 *             int left = Math.min(entry.getKey(),entry.getValue());
 *             if(array[left] > array[right]){
 *                 int temp = array[left];
 *                 array[left] = array[right];
 *                 array[right] = temp;
 *             }
 *         }
 *         boolean sorted = true;
 *         for(int i=0;i<n-1;i++){
 *             if(array[i] > array[i+1]){
 *                 sorted = false;
 *             }
 *         }
 *         if(sorted){
 *             System.out.println("YES");
 *         }
 *
 *
 *     }
 * }
 */
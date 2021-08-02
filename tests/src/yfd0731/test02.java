package yfd0731;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author yexiangyu
 * @description
 * @apiNote
 */
public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //整数个数
        int n = sc.nextInt();
        //抽取次数
        int m = sc.nextInt();
        //
        int k = sc.nextInt();
        int x = sc.nextInt();
        Set<Integer> set =  new HashSet<>();

        int max = 0;
        int min = 10;
        //上界
        int upBound = 0;
        //下界
        int downBound = 0;

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            set.add(a);
            max = Math.max(max,a);
            min = Math.min(min,a);
        }
        for(int i=0;i<m;i++){
            upBound = upBound*10+max;
            downBound = downBound*10 + min;
        }

        int res = 0;

        // 寻找 C = A*x+k, 判断是否符合条件
        int C = 0;
        int A = (downBound-k)/x;
//        System.out.print(upBound);
//        System.out.println(A*x+k);
//        System.out.println(downBound);

        while(C <= upBound){
            C = A*x+k;
            if(C < downBound){
                A++;
                continue;
            }
            A++;
            if(isLuckyNumber(C,set)){
                res++;
                System.out.print(C + " ");
            }
        }
        System.out.println();
        System.out.println(res);
    }

    public static boolean isLuckyNumber(int C, Set<Integer> set){
        int a = C%10;
        if(!set.contains(a)){
            return false;
        }
        C/=10;

        int b;
        boolean flag = true;
        while(C > 0){
            b = a;
            a = C%10;
            C/=10;
            if(!set.contains(a) || (a+b)%2==0){
                flag = false;
                break;
            }
        }
        return flag;

    }


}

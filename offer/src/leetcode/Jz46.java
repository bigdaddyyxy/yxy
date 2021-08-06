package leetcode;

/**
 * @author yexiangyu
 * @description 把数字翻译成字符串
 * @apiNote
 */
public class Jz46 {
    public static void main(String[] args) {
        int num = 12258;
        System.out.println(translateNum(num));
    }

    public static int translateNum(int num) {
        String s = Integer.toString(num);
        int n = s.length();
        int[] f = new int[n+1];
        f[0] = 1;
        f[1] = 1;
        int pre = s.charAt(0)-'0';
        int cur = 0;
        for(int i=2;i<=n;i++){
            cur = s.charAt(i-1)-'0';
            if(pre!=0 && (pre*10 + cur) <= 25 && i>=2){
                f[i] = f[i-1] + f[i-2];
            }else {
                f[i] = f[i-1];
            }
            pre = cur;
        }
        return f[n];
    }

}

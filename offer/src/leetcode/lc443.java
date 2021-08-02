package leetcode;

/**
 * @author yexiangyu
 * @description 压缩字符串
 * @apiNote
 */
public class lc443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','b','b','c','c','c'};
        int res = compress(chars);
        System.out.println(res);
        for (int i = 0; i < res; i++) {
            System.out.print(chars[i]+" ");
        }
    }

    public static int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        int size = 0;
        int start = 0;
        int end=0;
        while(start < chars.length){

            while(end<chars.length && chars[end] == chars[start]){
                end++;
            }
            chars[size++] = chars[start];
            if(end-start>1){
                for(char c :   (""+(end-start)).toCharArray() ){
                    chars[size++] = c;
                }
            }
            if(end == chars.length){
                break;
            }
            start = end;
        }
        return size;

    }
}

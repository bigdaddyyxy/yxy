package shopee0702;

import java.util.Locale;

public class test1 {
    public static void main(String[] args) {
        String s = "Hello1_world22 Hell(*(NO";
        String[] strs = mySplit(s);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<strs.length;i++){
            if(i==0){
                res.append(strs[i].toLowerCase() );
            }else{
                res.append(upAndLow(strs[i]));
            }
        }
        System.out.println(res.toString());

    }

    public static String[] mySplit(String s){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(i>0 && !isNumOrAlph(s.charAt(i)) &&!isNumOrAlph(s.charAt(i-1))) continue;
            char c = s.charAt(i);
            if (isNumOrAlph(c)) {
                builder.append(c);
            } else {
                builder.append(" ");
            }
        }
        return builder.toString().split(" ");
    }

    //是否字母或数字
    public static boolean isNumOrAlph(char c){
        return (c >='0' && c<='9') || (c>='a'&&c<='z')||(c>='A'&& c<='Z');
    }




    public static String upAndLow(String s){
        StringBuilder sb = new StringBuilder();

        sb.append(s.toUpperCase().charAt(0));
        sb.append(s.substring(1).toLowerCase());
        return sb.toString();
    }
}

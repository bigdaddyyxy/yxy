public class leetcode08 {
    public static void main(String[] args) {
        String s = "  -42";

        int i = myAtoi(s);
        System.out.println(i);


    }
    public static int myAtoi(String s){
        int result = 0;
        int flag = 1;
        int i = 0;
        if(s.length()==0) return 0;
        while(i<s.length()-1  &&s.charAt(i)==' '){
            i++;
        }

        //判断正负
        if(s.charAt(i) == '-')flag=-1;
        if(s.charAt(i) == '+'|| s.charAt(i) == '-') i++;

        //判断是否有效
        if(i==s.length()) return 0;
        if(!isNumber(s.charAt(i))) return 0;

        while(i<s.length() && isNumber(s.charAt(i))){
            int a = s.charAt(i) - '0';
            if(result > Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && a>7)){
                return  flag>0 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result = result*10 +a;
            i++;

        }

        return result*flag;
    }

    public static boolean isNumber(char c){
        int i = c -'0';
        return (i>=0 && i<=9);
    }



}

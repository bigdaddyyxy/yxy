package shopee0705;

public class test02 {
    public static void main(String[] args) {
        String s = "aaaAAAbbbcccc";
        String s1 = compressString(s);
        System.out.println(s1);
    }



    public static String compressString(String S) {
        String s = S.toLowerCase();
        if (s.length() == 0) { // 空串处理
            return s;
        }

        StringBuffer ans = new StringBuffer();
        int count = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(c == s.charAt(i)){
                count++;
            }else {
                ans.append(c);
                if(count > 1){
                    ans.append(count);
                }
                c = s.charAt(i);
                count = 1;
            }
        }
        ans.append(c);
        if(count > 1){
            ans.append(count);
        }
        return ans.length() > s.length() ? s : ans.toString();
    }
}

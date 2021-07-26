public class leetcode38 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(countAndSay(i));
        }


    }

    public static String countAndSay(int n) {
        StringBuilder[] s = new StringBuilder[n];
        s[0] = new StringBuilder();
        s[0].append('1');
        int i = 1;
        while(i<n){
            s[i] = new StringBuilder();
            char[] chars = s[i - 1].toString().toCharArray();
            int count = 1;
            for (int j = 0; j < chars.length; j++) {
                if(j<chars.length-1 && chars[j]==chars[j+1]){
                    count++;
                }else{
                    char cur = (char) ('0' + count);
                    s[i].append( cur);
                    s[i].append(chars[j]);
                    count = 1;
                }
            }
            i++;
        }
        return s[n-1].toString();
    }

}

public class leetcode91 {
    public static void main(String[] args) {
        String s = "27";


       System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        int n = s.length();            //s的长度

        if(s.charAt(0) == '0') return 0;

        int[] res = new int[n];
        res[0] = 1;

        for(int i=1;i<n;i++){
            if(s.charAt(i) != '0') res[i] += res[i-1];


            if(s.charAt(i-1) != '0' && ( ((s.charAt(i-1)-'0')*10+(s.charAt(i)-'0')) <=26) ){
                res[i] = i==1? res[i]+1 : res[i]+res[i-2] ;
            }

        }

        return res[n-1];

    }

}

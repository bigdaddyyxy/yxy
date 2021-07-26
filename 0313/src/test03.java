import java.util.ArrayList;
import java.util.List;

public class test03 {
    public static void main(String[] args) {
        int left = 0;
        int right = 0;
        int n = 7;
        List<String> result = new ArrayList<String>();
        backtrack(n,result,0,0,new StringBuilder());

//        for (String s : result) {
//            System.out.println(s);
//        }


        String s = " jdisa";
        System.out.println(s.length());
        System.out.println(s.trim().length());

    }

    public static boolean isNumber(char c){
        int i = c -'0';
        return (i>=0 && i<=9);
    }



    public static void backtrack(int n, List<String> res, int left, int right, StringBuilder cur){
        if(cur.length() == n*2){
            res.add(cur.toString());
            return;
        }
        if(left < n){
            cur.append('(');
            backtrack(n,res,left+1,right,cur);

            cur.deleteCharAt(cur.length()-1);
        }
        if(right<left){
            cur.append(')');
            backtrack(n,res,left,right+1,cur);
            cur.deleteCharAt(cur.length()-1);
        }



    }
}



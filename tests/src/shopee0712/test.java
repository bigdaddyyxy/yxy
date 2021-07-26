package shopee0712;

import java.util.*;

//shopee 20210712一面 算法题
public class test {
    public static void main(String[] args) {
        String s = "0430213202";
        String s1 = addBrackets(s);
        System.out.println(s1);
    }

    public static String addBrackets(String s){
        StringBuilder res = new StringBuilder();
        Deque<Character> list = new LinkedList<>();

        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            int num = c-'0';
            if(list.isEmpty()){
                for (int j = 0; j < num; j++) {
                    res.append('(');
                    list.add(')');
                }
                res.append(c);
            }else if(i>0){
                int prenum = s.charAt(i - 1) - '0';
                if(num>prenum){
                    for(int j=0;j<num-prenum;j++){
                        res.append('(');
                        list.push(')');
                    }
                }
                if(num<prenum){
                    for (int j=0;j<prenum-num;j++){
                        res.append(list.pop());
                    }
                }
                res.append(c);
            }
        }
        while(!list.isEmpty()){
            res.append(list.pop());
        }

        return res.toString();
    }

}

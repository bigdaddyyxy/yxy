import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode17 {
    public static void main(String[] args) {
        String s = "23";
        List<String> list = letterCombinations(s);
        for (String s1 : list) {
            System.out.println(s1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0) return result;

        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        backtrack(result,phoneMap,digits,0,new StringBuilder());
        return result;
    }

    public static void backtrack(List<String> result,Map<Character, String> phoneMap, String digits,int index,  StringBuilder combination){

        if (index == digits.length()){
            result.add(combination.toString());

        }else{
            char c = digits.charAt(index);
            String s = phoneMap.get(c);

            for (int i = 0; i < s.length(); i++) {
                combination.append(s.charAt(i));
                backtrack(result, phoneMap, digits, index+1, combination);
                combination.deleteCharAt(index);
            }
        }


    }


}

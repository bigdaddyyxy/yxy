package shopee0702;

public class test1_2 {
    public static void main(String[] args) {
        String s = "HelLo1_world22 Hell(*(NO";
        s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        int n = s.length();
        boolean toUpper = false;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if (isNumOrAlph(c)){
                if(toUpper){
                    builder.append(Character.toUpperCase(c));
                    toUpper =false;
                }else{
                    builder.append(Character.toLowerCase(c));
                }
            }else {
                toUpper =true;
            }

        }
        System.out.println(builder.toString());

    }



    public static boolean isNumOrAlph(char c){
        return (c >='0' && c<='9') || (c>='a'&&c<='z')||(c>='A'&& c<='Z');
    }
}

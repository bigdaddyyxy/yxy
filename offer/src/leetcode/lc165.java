package leetcode;

/**
 * @author yexiangyu
 * @description 比较版本号
 * @apiNote
 */
public class lc165 {

    public static void main(String[] args) {
        String version1 = "1.001";
        String version2 = "1.001.02";
        System.out.println(compareVersion(version1,version2));
    }

    public static int compareVersion(String version1, String version2) {
        int length1 = version1.length();
        int length2 = version2.length();
        int l1 = 0, r1 = 0;
        int l2 = 0, r2 = 0;
        while(l1 < length1 || l2 < length2){
            while(r1 < length1 && version1.charAt(r1)!='.'){
                r1++;
            }

            int num1 = r1>l1 ? Integer.parseInt(version1.substring(l1,r1)) : 0 ;
            l1 = ++r1;
            while(r2 < length2 && version2.charAt(r2)!='.'){
                r2++;
            }
            int num2 = r2>l2 ? Integer.parseInt(version2.substring(l2,r2)) : 0 ;
            l2 = ++r2;
            if(num1!=num2){
                return num1>num2 ? 1 : -1;
            }

        }

        return 0;
    }
}

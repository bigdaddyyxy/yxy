import java.util.*;

public class test04 {
    public static void main(String[] args) {
//        Integer a = new Integer(3);
//        Integer b = new Integer(3);
//
//        System.out.println(a==b);                     //false
//        System.out.println(a.equals(b));              //true


//        HashMap<Integer, Integer> map = new HashMap<>();
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[]{2,3});
//        list.add(new int[]{4,5});
//        list.add(new int[]{1,10});
//        int[][] ints = list.toArray(new int[list.size()][]);
//        for (int[] nums : ints) {
//            for (int num : nums) {
//                System.out.print(num);
//            }
//            System.out.println();
//        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(5);
        System.out.println(set);
        list.addAll(set);
        System.out.println(list);
    }

}

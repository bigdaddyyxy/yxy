package Test03;

import java.util.*;

public class Demo {
    static Deque<Integer> values = new ArrayDeque<>();

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        values.add(2);
        values.add(1);
        values.add(3);

        Integer i = values.pop();
        System.out.println(i);
        Iterator<Integer> it = values.iterator();
        int count = 0;
        while (it.hasNext() && count<2){
            System.out.println(it.next());
            count++;
        }

        LinkedList<Integer> list = new LinkedList<>();

        HashMap<Character, Integer> map = new HashMap<>();
        char c = 'a';

        map.put(c, map.getOrDefault(c,0)+1);


    }
}

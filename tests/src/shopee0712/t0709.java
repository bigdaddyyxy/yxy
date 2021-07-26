package shopee0712;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class t0709 {
    static int res;
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        System.out.println(map.size());
//        map.put(1,"aaa");
//        System.out.println(map.size());

//        String s = "cacab";
//        System.out.println(resort(s));
        int[][] array = new int[][]{{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        System.out.println(numWays(5,array,3));
    }

//    public static String resort(String s){
//        char[] c = s.toCharArray();
//        Arrays.sort(c);
//        for (char c1 : c) {
//            System.out.println(c1);
//        }
//        String s1 = new String(c);
//        System.out.println(s1);
//        return c.toString();
//    }
    public static int numWays(int n, int[][] relation, int k) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }

        int m = relation.length;
        for(int i=0;i<m;i++){
            graph.get(relation[i][0]).add(relation[i][1]);
        }
        List<Integer> path =  new ArrayList<Integer>();
        path.add(0);
        dfs(graph,path,k, n-1);
        return res;
    }

    public static void dfs(List<List<Integer>> graph, List<Integer> path, int step,int end){
        int point = path.get(path.size()-1);
        if(step==0){
            if(point == end){
                res++;
            }
            return;
        }

        List<Integer> cur = graph.get(point);
        int size = cur.size();
        if(size==0) return;
        for(int i=0;i<size;i++){
            int j = cur.get(i);
            path.add(j);
            dfs(graph,path,step-1, end);
            path.remove(path.size()-1);
        }
    }


}

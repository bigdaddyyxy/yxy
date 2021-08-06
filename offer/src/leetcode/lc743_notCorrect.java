package leetcode;

import java.util.*;

/**
 * @author yexiangyu
 * @description 网络延迟时间
 * @apiNote
 */
public class lc743_notCorrect {
    public static void main(String[] args) {
        int[][] times = new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        System.out.println(networkDelayTime(times,n,k));
    }

    static List<Map<Integer,Integer>> graph = new ArrayList<>();
    static boolean[] connected;
    static int res = 0;
    static int amount;
    public static int networkDelayTime(int[][] times, int n, int k) {
        for(int i=0;i<=n;i++){
            graph.add(new HashMap<Integer,Integer>());
        }
        for(int[] t:times){
            graph.get(t[0]).put(t[1],t[2]);
        }

        connected = new boolean[n+1];
        connect(k,0);
        if (amount == n){
            Arrays.fill(connected,false);
            dfs(k,0);
        }
        return res;
    }
    public static void dfs(int index,int spend){
        connected[index] = true;
        Map<Integer, Integer> map = graph.get(index);
        for (int i=1;i<connected.length;i++){
            if(!connected[i] && map.containsKey(i)){
                int time = map.get(i);
                res = Math.max(spend+time,res);
                connected[i] = true;
                dfs(i,spend+time);
                connected[i] = false;
            }
        }

    }

    public static void connect(int index, int spend){
//        if(amount == connected.length-1){
//            return;
//        }
        connected[index] = true;
        amount++;
        int min = 0x3f3f3f3f;
        int nextIndex = 0;
        for(int i=1;i<connected.length;i++){
            if(connected[i]){
                Map<Integer, Integer> map = graph.get(i);
                for (int j=1;j<connected.length;j++){
                    if (connected[j] || !map.containsKey(j)){
                        continue;
                    }else{
                        int time = map.get(j);
                        if(time<min){
                            min = time;
                            nextIndex = j;
                        }
                    }
                }
            }
        }
        if(nextIndex!=0){
            connect(nextIndex,spend+min);
        }else{
            return;
        }
    }
}

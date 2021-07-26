package fanruan0716;

import java.util.Date;

public class resolution02 {
    static int res = Integer.MAX_VALUE;
    static boolean[][] visited;
    public static void main(String[] args) {
        int[] start = new int[]{8,9};
        int[] end = new int[]{2,3};
        long a = System.currentTimeMillis();
        //System.out.println(a);

        findMinPath(start,end);

        long b = System.currentTimeMillis();
        //System.out.println(b);
        System.out.println(res);

        System.out.println("用时："+(b-a));
    }


    public static void findMinPath (int[] start, int[] end) {
        // write code here
        int[][] graph = new int[11][11];
        graph[1][2] = -1;graph[4][5] = -1;
        graph[1][3] = -1;graph[5][5] = -1;
        graph[2][2] = -1;graph[6][5] = -1;
        graph[2][7] = -1;graph[7][3] = -1;
        graph[3][1] = -1;graph[7][4] = -1;
        graph[3][2] = -1;graph[7][5] = -1;
        graph[3][5] = -1;graph[7][8] = -1;
        graph[3][6] = -1;graph[8][2] = -1;
        graph[8][7] = -1;graph[8][8] = -1;
        visited = new boolean[11][11];
        visited[start[0]][start[1]] = true;
        dfs(graph,start[0],start[1],end[0],end[1],0);
     //   return res;
    }

    public static void dfs(int[][] graph, int x, int y, int targetX, int targetY, int step){
        if(x == targetX && y==targetY){
            res = Math.min(res,step);
            return;
        }
        if(step >= res) return;

        if(x < graph[0].length-1 && !visited[x+1][y] && graph[x+1][y] != -1){
            visited[x+1][y] = true;
            dfs(graph,x+1,y,targetX,targetY,step+1);
            visited[x+1][y] = false;
        }

        if(x > 0 && !visited[x-1][y] && graph[x-1][y] != -1 ){
            visited[x-1][y] = true;
            dfs(graph,x-1,y,targetX,targetY,step+1);
            visited[x-1][y] = false;
        }

        if(y<graph.length-1 && !visited[x][y+1] && graph[x][y+1] != -1){
            visited[x][y+1] = true;
            dfs(graph,x,y+1,targetX,targetY,step+1);
            visited[x][y+1] = false;
        }

        if(y>0 && !visited[x][y-1] && graph[x][y-1] != -1 ){
            visited[x][y-1] = true;
            dfs(graph,x,y-1,targetX,targetY,step+1);
            visited[x][y-1] = false;
        }

    }
}
/*
import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 寻找两点之间的最短路径
     * @param start int整型一维数组 起点, 数组长度2，位置0为x轴，位置1为y轴
     * @param end int整型一维数组 终点 ，数组长度2，位置0为x轴，位置1为y轴
     * @return int整型


    int res = Integer.MAX_VALUE;
    boolean[][] visited;
    public int findMinPath (int[] start, int[] end) {
        // write code here
        int[][] graph = new int[11][11];
        graph[1][2] = -1;graph[4][5] = -1;
        graph[1][3] = -1;graph[5][5] = -1;
        graph[2][2] = -1;graph[6][5] = -1;
        graph[2][7] = -1;graph[7][3] = -1;
        graph[3][1] = -1;graph[7][4] = -1;
        graph[3][2] = -1;graph[7][5] = -1;
        graph[3][5] = -1;graph[7][8] = -1;
        graph[3][6] = -1;graph[8][2] = -1;
        graph[8][7] = -1;graph[8][8] = -1;
        visited = new boolean[11][11];
        visited[start[0]][start[1]] = true;
        dfs(graph,start[0],start[1],end[0],end[1],0);
        return res;
    }

    public void dfs(int[][] graph, int x, int y, int targetX, int targetY, int step){
        if(x == targetX && y==targetY){
            res = Math.min(res,step);
            return;
        }
        if(step >= res) return;

        if(x < graph[0].length-1 && !visited[x+1][y] && graph[x+1][y] != -1){
            visited[x+1][y] = true;
            dfs(graph,x+1,y,targetX,targetY,step+1);
            visited[x+1][y] = false;
        }

        if(x > 0 && !visited[x-1][y] && graph[x-1][y] != -1 ){
            visited[x-1][y] = true;
            dfs(graph,x-1,y,targetX,targetY,step+1);
            visited[x-1][y] = false;
        }

        if(y<graph.length-1 && !visited[x][y+1] && graph[x][y+1] != -1){
            visited[x][y+1] = true;
            dfs(graph,x,y+1,targetX,targetY,step+1);
            visited[x][y+1] = false;
        }

        if(y>0 && !visited[x][y-1] && graph[x][y-1] != -1 ){
            visited[x][y-1] = true;
            dfs(graph,x,y-1,targetX,targetY,step+1);
            visited[x][y-1] = false;
        }

    }


}


 */
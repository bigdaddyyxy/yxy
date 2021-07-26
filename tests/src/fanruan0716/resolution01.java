package fanruan0716;

public class resolution01 {


    public static void main(String[] args) {
        int[] rectA = new int[]{0,0,10,10};
        int[] rectB = new int[]{5,5,2,2};

        System.out.println(rectIntersectArea(rectA, rectB));

    }

    public static int rectIntersectArea(int[] rectA, int[] rectB){
        int res = 0;

        int ax1 = rectA[0];
        int ay1 = rectA[1];
        int ax2 = ax1 + rectA[2];
        int ay2 = ay1 + rectA[3];

        int bx1 = rectB[0];
        int by1 = rectB[1];
        int bx2 = bx1 + rectB[2];
        int by2 = by1 + rectB[3];

        if( (ax1 <= bx1 && ax2 >= bx1) || ( ax1<=bx2 && ax2>= bx2  )){
            if ((ay1 <= by1 && ay2 >= by1) || ( ay1<=by2 && ay2>= by2  )){
                int x = Math.abs(Math.min(bx2,ax2)-Math.max(ax1,bx1));
                int y = Math.abs(Math.min(ay2,by2)-Math.max(ay1,by1));
                res = x*y;
            }
        }

        return res;

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
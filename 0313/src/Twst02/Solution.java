package Twst02;

import java.util.Map;

class Solution {

    public boolean solution(int[] A, int[] P, int B, int E) {
        // write your code in Java SE 8
        int axis_max = 0;
        //A_size = A.length
        for(int i =0; i<A.length;i++){
            axis_max = Math.max(axis_max, A[i] + P[i]);
        }
        int[] V = new int[axis_max +1];
        for (int i = 1; i< axis_max;i++){
            V[i] = i;
        }
        for (int i=0; i<A.length; i++){
            for(int pos = P[i]-A[i]; pos<= P[i]+A[i];pos++){
                if(pos >= 0){
                    merge(V,pos,P[i]);
                }
            }
        }

        return find(V,B) == find(V,E);


    }
   int find(int[] V, int x){
        return (V[x] == x) ? x: (V[x] = find(V, V[x]));

    }
    void merge(int[] V, int x, int y){
        int a = find(V ,x);
        int b = find(V, y);
        if(a != b){
            V[a] = b;
        }

    }


}

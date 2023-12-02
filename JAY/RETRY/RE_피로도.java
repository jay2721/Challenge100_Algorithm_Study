package JAY.RETRY;

import java.util.*;

public class RE_피로도 {
    public static int k = 80;
    public static int[][] dungeons = {{80,20},{50,40},{30,10}};

    public static int answer;
    public static boolean[] visited;

    public static void main(String[] args) {
        visited= new boolean[dungeons.length];
        dfs(0,k,dungeons);

        System.out.println(answer);
    }

    public static void dfs(int depth, int k, int[][] dungeons){
        for(int i=0;i<dungeons.length;i++){
            if(visited[i]==false && k>=dungeons[i][0]){
                visited[i]=true;
                dfs(depth+1,k-dungeons[i][1],dungeons);
                visited[i]=false;
            }
        }

        answer = Math.max(answer, depth);
    }
}

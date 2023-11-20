package JAY;

public class PGS_네트워크 {
    public static boolean [] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for(int i=0;i<n;i++){
            if (!visited[i]) {
                dfs(computers,i);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int[][] computers,int i){
        visited[i]=true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && visited[j] == false) {
                dfs(computers,j);
            }
        }
    }
}

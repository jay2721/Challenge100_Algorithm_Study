package JAY;

import java.util.*;

public class PGS_여행경로 {
    public static boolean[] visited;
    public static List<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];

        dfs(tickets, "ICN", "ICN", 0);
        Collections.sort(list);


        String[] answer=list.get(0).split(",");

        return answer;
    }
    public void dfs(String[][] tickets,String now, String path, int cnt){
        if(cnt==tickets.length){
            list.add(path);
            return;
        }

        for(int i=0;i<tickets.length;i++){
            if(!visited[i] && now.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets, tickets[i][1], path+","+tickets[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }
}

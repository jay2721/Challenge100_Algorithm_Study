package JSB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class PGS_여행경로 {
    class Solution {
        static boolean[] visit;
        static List<String> list = new ArrayList<>();
        public String[] solution(String[][] tickets) {
            visit = new boolean[tickets.length];
            list = new ArrayList<String>();
            String path = "ICN";

            dfs(tickets,"ICN",path,0);
            Collections.sort(list);

            return list.get(0).split(" ");
        }
        static void dfs(String[][] tickets, String start, String path, int count){
            if(count == tickets.length){
                list.add(path);
                return;
            }
            for(int i=0;i<tickets.length;i++){
                if(!visit[i] && tickets[i][0].equals(start)){
                    visit[i] = true;
                    dfs(tickets,tickets[i][1],path+" "+tickets[i][1],count+1);
                    visit[i] = false;
                }
            }
        }
    }

}

package JSB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PGS_롤케이크자르기 {
    class Solution {
        public int solution(int[] topping) {
            int answer = 0;
            int[][] log  = new int[2][10001];

            for(int cur : topping){
                if(log[0][cur]==0) log[0][0]++;
                log[0][cur]++;
            }

            for(int cur : topping){
                log[0][cur]--;
                if(log[0][cur]==0) log[0][0]--;
                if(log[1][cur]==0) log[1][0]++;
                log[1][cur]++;
                if(log[0][0] == log[1][0]) answer++;
            }
            return answer;
        }
    }
}

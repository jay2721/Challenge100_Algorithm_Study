package JAY;

public class PGS_등굣길 {
    class Solution {
        public int solution(int m, int n, int[][] puddles) {
            int answer = 0;

            int[][] board = new int[n][m];

            for(int i = 0; i < puddles.length; i++){
                int x = puddles[i][1] - 1;
                int y = puddles[i][0] - 1;
                board[x][y] = -1;
            }


            board[0][0] = 1;

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(board[i][j]==-1){
                        continue;
                    }
                    if(i>0){
                        if(board[i - 1][j] != -1){
                            board[i][j] = (board[i][j]+board[i - 1][j]);
                        }
                    }
                    if(j>0){
                        if(board[i][j - 1] != -1){
                            board[i][j] = (board[i][j] + board[i][j - 1]);
                        }
                    }
                    // System.out.println(i+","+j+": "+board[i][j]);
                    board[i][j] %=1000000007;
                }
            }
//            answer = board[n - 1][m - 1]%=1000000007;
            answer = board[n - 1][m - 1];
            return answer;
        }
    }
}

package JAY;

public class PGS_정수삼각형 {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] sum = new int[triangle.length][triangle.length];

        sum[0][0]=triangle[0][0];

        for(int i=1;i<triangle.length;i++){
            sum[i][0]=sum[i-1][0]+triangle[i][0];
            sum[i][i]=sum[i-1][i-1]+triangle[i][i];

            for(int j=1;j<=i;j++){
                sum[i][j]=Math.max(sum[i-1][j],sum[i-1][j-1])+triangle[i][j];
                answer=Math.max(answer,sum[i][j]);
            }
        }

        return answer;
    }
}

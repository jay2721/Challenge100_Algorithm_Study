package JAY.RETRY;

public class RE_광물캐기 {
    public static int[] picks ={1, 3, 2};
    public static String[] minerals={"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
    public static int result = Integer.MAX_VALUE;
    public static int[][] tiredLevel = {{1,1,1},{5,1,1},{25,5,1}};

    public static void main(String[] args) {
        int dia = picks[0];
        int iron = picks[1];
        int stone = picks[1];

        if (dia > 0)
            dfs(0, 0, 0, dia-1, iron, stone);
        if (iron > 0)
            dfs(0, 1, 0, dia, iron-1, stone);
        if (stone > 0)
            dfs(0, 2, 0, dia, iron, stone-1);

        System.out.println(result);
    }

    public static void dfs(int tired, int toolIdx, int cnt, int dia, int iron, int stone){
        if(cnt >= minerals.length){
            result = Math.min(result, tired);
            return;
        }

        if (minerals[cnt].equals("diamond")) {
            tired+=tiredLevel[toolIdx][0];
        } else if (minerals[cnt].equals("iron")) {
            tired+=tiredLevel[toolIdx][1];
        } else if (minerals[cnt].equals("stone")) {
            tired+=tiredLevel[toolIdx][2];
        }

        if ((cnt + 1) % 5 == 0) {
            if ((dia == 0 && iron == 0 && stone == 0)) {
                result = Math.min(result, tired);
                return;
            }

            if (dia > 0) {
                dfs (tired, 0, cnt+1, dia-1, iron, stone);
            }

            if (iron > 0) {
                dfs(tired, 1, cnt+1, dia, iron-1, stone);
            }

            if (stone > 0) {
                dfs(tired, 2, cnt+1, dia, iron, stone-1);
            }
        } else {
            dfs(tired, toolIdx, cnt+1, dia, iron, stone);
        }
    }
}

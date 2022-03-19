public class _05路径 {
    private static int[][] map;
    //最短路径求法
    public static void floyd(int[][] map,int n){
        for (int k=1;k<=n;k++){
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    map[i][j] = Math.min(map[i][j],(map[i][k]+map[k][j]));
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 2021;
        for (int i=1;n<n;i++){
            for (int j=1;j<n;j++){
                if (i==j){
                    map[i][j] = 0;
                }else if (Math.abs(i-j)<=21){
                    map[i][j] = map[j][i] = i*j/gcd(i,j);
                }else {
                    map[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        floyd(map,n);
        System.out.println(map[1][2021]);
    }

    private static int gcd(int i, int j) {
        if (j==0)return i;
        return gcd(j,i%j);
    }
}

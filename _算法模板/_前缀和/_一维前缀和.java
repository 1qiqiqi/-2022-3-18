package _前缀和;

import java.io.*;

public class _一维前缀和 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int q = Integer.parseInt(split[2]);

        int [][]arr = new int[n + 1][m + 1];
        int [][]s = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            split = br.readLine().split(" ");
            for(int j = 0; j < split.length; j++) {
                arr[i + 1][j + 1] = Integer.parseInt(split[j]);
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + arr[i][j];
            }
        }

        for(int i = 0; i < q; i++) {
            split = br.readLine().split(" ");
            int x1 = Integer.parseInt(split[0]);
            int y1 = Integer.parseInt(split[1]);
            int x2 = Integer.parseInt(split[2]);
            int y2 = Integer.parseInt(split[3]);
            System.out.println(s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]);
        }
    }
}
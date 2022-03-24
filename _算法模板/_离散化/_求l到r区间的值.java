package _离散化;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _求l到r区间的值 {
    private static class MyPair {
        public int x;
        public int y;

        public MyPair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 寻找 x 对应的离散化后的数据，这里从 1 开始，为了方便计算前缀和
    private static int find(List<Integer> alls, int x) {

        int l = 0, r = alls.size() - 1;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (alls.get(mid) >= x) r = mid;
            else l = mid + 1;
        }

        return r + 1;
    }

    // Leetcode 0026
    private static int unique(List<Integer> alls) {

        int j = 0;
        for (int i = 0; i < alls.size(); i++)
            if (i == 0 || alls.get(i) != alls.get(i - 1))
                alls.set(j++, alls.get(i));
        // alls[0] ~ alls[j - 1] 所有a中不重复的数
        return j;
    }

    public static void main(String[] args) {

        // 读入数据
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  // 操作的个数
        int m = scan.nextInt();  // 询问的个数
        List<Integer> alls = new ArrayList<>();  // 需要离散化的数据
        List<MyPair> add = new ArrayList<>(); // 操作
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt(), c = scan.nextInt();
            add.add(new MyPair(x, c));
            alls.add(x);
        }
        List<MyPair> query = new ArrayList<>();  // 询问
        for (int i = 0; i < m; i++) {
            int l = scan.nextInt(), r = scan.nextInt();
            query.add(new MyPair(l, r));
            alls.add(l);
            alls.add(r);
        }

        // 算法代码
        int N = n + 2 * m + 10;
        int[] a = new int[N];  // a[i] 代表离散到 i 的原始坐标点对应的数据
        int[] s = new int[N];  // a数组前缀和
        // 离散化：排序、去重
        Collections.sort(alls);
        int u = unique(alls);
        alls = alls.subList(0, u);
        // 处理插入
        for (MyPair pair : add) {
            int x = find(alls, pair.x);  // 获取离散化后的值
            a[x] += pair.y;
        }
        // 预处理前缀和
        for (int i = 1; i <= alls.size(); i++) s[i] = s[i - 1] + a[i];
        // 处理问询
        for (MyPair pair : query) {
            int l = find(alls, pair.x), r = find(alls, pair.y);
            System.out.println(s[r] - s[l - 1]);
        }
    }
}

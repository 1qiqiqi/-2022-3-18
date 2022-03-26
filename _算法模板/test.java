import java.util.*;

public class test {
    private static class Mypair{
        private int x;
        private int y;

        public Mypair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static int unique(List<Integer> list){
        int j = 0;
        for (int i=0;i<list.size();i++){
            if (i==0||list.get(i)!=list.get(i-1)){
                list.set(j++,list.get(i));
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();//询问的个数
        int n = input.nextInt(); //操作的个数
        List<Mypair> add = new ArrayList<>();
        List<Integer> alls = new ArrayList<>();//需要离散化的数据
        for (int i=0;i<n;i++){
            int x = input.nextInt(),c = input.nextInt();
            add.add(new Mypair(x,c));
            alls.add(x);
        }
        List<Mypair> query = new ArrayList<>();//询问
        for (int i=0;i<m;i++){
            int l =input.nextInt(),r = input.nextInt();
            query.add(new Mypair(l,r));
            alls.add(l);
            alls.add(r);

        }
        //算法代码
        int N= n + 2*m + 10;
        int [] a = new int[N];//a[i]代表离散到i的原始坐标点对应的数据
        int [] s = new int[N];//a数组前缀和
        //离散化：排序、去重
        Collections.sort(alls);
        int u = unique(alls);
        alls = alls.subList(0,u);
        //
        for (Mypair pair:add){
            int x = find(alls,pair.x);
            a[x] += pair.y;
        }
        for (int i=1;i<alls.size();i++){
            s[i] = s[i-1] + a[i];
        }
        //处理询问
        for (Mypair pair:query){
            int l = find(alls,pair.x),r = find(alls,pair.y);
            System.out.println(s[l]-s[r-1]);
        }
    }

    private static int find(List<Integer> alls, int x) {
        int l = 0,r = alls.size()-1;
        while (l!=r){
            int mid = (l+r)/2;
            if (alls.get(mid)>=x)r = mid;
            else l = mid+1;
        }
        return l;
    }
}

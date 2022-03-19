public class _02振兴中华 {
    public static void main(String[] args) {
        int f = f(0, 0);
        System.out.println(f);
    }

    private static int f(int m, int n) {
        if (m==3||n==4)return 1;
        return f(m,n+1)+f(m+1,n);
    }
}

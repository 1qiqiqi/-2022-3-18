public class _第四题2019的不同正整数的和 {
    public static void main(String[] args) {
        int n= 2019;
        int res = 0;
        for (int i=1;i<=n;i++){
            for (int j=i+1;i<=n&&n-i-j>j;j++){
                int c = n-i-j;
                if (check(c)&&check(i)&&check(j)){
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    private static boolean check(int c) {
        while (c>0){
            if (c%10==2||c%10==4){
                return false;
            }
            c/=10;
        }
        return true;
    }
}

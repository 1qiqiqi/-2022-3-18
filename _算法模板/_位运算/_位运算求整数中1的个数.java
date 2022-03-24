package _位运算;

public class _位运算求整数中1的个数 {
    public static void main(String[] args) {
        int n =10;
        int res= 0;
        while (n!=0){
            int tmp = n>>1&1;
            if (tmp==1)res++;
            n = n>>1;
        }
        System.out.println(res);
    }
}

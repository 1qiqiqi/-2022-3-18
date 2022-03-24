package _位运算;

public class _位运算交换位置省空间 {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        System.out.println(m);
        System.out.println(n);
    }
}

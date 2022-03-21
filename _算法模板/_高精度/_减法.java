package _高精度;

import java.util.Arrays;

public class _减法 {
    public static void main(String[] args) {
        //取数
        String a = "345", b = "324";
        int[] a_num = new int[a.length()];
        int[] b_num = new int[b.length()];
        for (int i = 0; i < a_num.length; i++) {
            a_num[i] = a.charAt(a_num.length - i - 1) - 48;//很奇怪不知道为什么要减48
        }
        System.out.println(Arrays.toString(a_num));
        for (int i = 0; i < b_num.length; i++) {
            b_num[i] = b.charAt(b_num.length - i - 1) - 48;
        }
        int[] C;
        if (cmp(a_num, b_num)) {
            C = sub(a_num, b_num);
        } else {
            C = sub(b_num, a_num);
        }

        for (int i = C.length - 1; i >= 0; i--) {
            System.out.print(C[i] + "");
        }
    }

    public static int[] sub(int[] a_num, int[] b_num) {
        int[] C = new int[4];
        for (int i=0,t=0;i<a_num.length;i++){
            t = a_num[i] - t;
            if (i<b_num.length)t -= b_num[i];
            C[i] = (10+t)%10;
            if (t<0)t = 1;
            else t = 0;
        }
        return C;
    }

    public static boolean cmp(int[] a_num, int[] b_num) {
        if (a_num.length != b_num.length) return a_num.length > b_num.length;
        //此时说明两个数组长度相等
        for (int i = 0; i < a_num.length; i++) {
            if (a_num[i] != b_num[i]) return a_num[i] > b_num[i];
        }
        return true;
    }
}

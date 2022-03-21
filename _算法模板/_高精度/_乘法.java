package _高精度;

import java.util.Arrays;

public class _乘法 {
    public static void main(String[] args) {
        String a = "345";
        int[] a_num = new int[a.length()];
        for (int i = 0; i < a_num.length; i++) {
            a_num[i] = a.charAt(a_num.length - i - 1) - '0';//很奇怪不知道为什么要减48
        }
        System.out.println(Arrays.toString(a_num));
        int b = 4;
        mul(a_num, b);
//        System.out.println(Arrays.toString(mul));
    }

    private static void mul(int [] nums,int b) {
        int t =0;
        for (int i=0;i<nums.length||t!=0;i++){
            if (i<nums.length)t += nums[i]*b;
            System.out.println(t%10);
            t /= 10;
        }
    }
}

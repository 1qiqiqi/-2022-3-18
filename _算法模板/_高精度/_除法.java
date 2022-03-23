package _高精度;

import java.util.Arrays;

public class _除法 {
    public static void main(String[] args) {
        String a = "345";
        System.out.println(345/4);
        int[] a_num = new int[a.length()];
        for (int i = 0; i < a_num.length; i++) {
            a_num[i] = a.charAt(a_num.length - i - 1) - '0';//很奇怪不知道为什么要减48
        }
        System.out.println(Arrays.toString(a_num));
        int b = 4;
        div(a_num, b);
    }

    private static void div(int[] a_num, int b) {
       for (int i=a_num.length-1,t = 0;i>=0;i--){
           t = t * 10+a_num[i];
           System.out.println(t/b);
           t %=b;
       }
    }
}

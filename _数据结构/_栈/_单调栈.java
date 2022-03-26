package _栈;

import java.util.Arrays;
import java.util.Scanner;

public class _单调栈 {
    static int [] stack = new int[10];
    static int tt = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要输入的个数：");
        int n = input.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("请输入要输入的数");
            int x = input.nextInt();
            while (tt!=0&&stack[tt]>=x)tt--;
            if (tt!=0) System.out.println(stack[tt]);
            else System.out.println(-1);
            stack[++tt] = x;
        }
        System.out.println(Arrays.toString(stack));
    }
}

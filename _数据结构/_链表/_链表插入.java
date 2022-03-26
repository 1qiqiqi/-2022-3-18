package _链表;

import java.util.Arrays;

public class _链表插入 {
    public static int head=-1;//存储头节点的下标，它没有值

    public static int idx = 0;//初始化第一个位置

    public static int[] ne;

    public static int[] e;

    public static void add_to_head(int x){
        e[idx] = x;
        ne[idx] = ne[head];
        head= idx;
        idx++;
    }

    public static void add(int k,int x){//将x插入下标是k的点后面
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx;
        idx++;
    }
    public static void remove(int k){//删除下标为k的后面的点
        ne[k] = ne[ne[k]];
    }
    public static void main(String[] args) {
        add_to_head(3);
//        add(0,2);
        System.out.println(Arrays.toString(e));
    }
}

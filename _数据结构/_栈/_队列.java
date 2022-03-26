package _栈;

public class _队列 {
    public int[] que;
    public int hh = 0,tt=-1;
    public void add(int x){
        que[++tt] = x;
    }
    public int remove(){
        return que[hh++];
    }
    public int peak(){
        return que[hh];
    }
}

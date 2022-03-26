package _栈;

public class _栈的定义 {
    public int tt;
    public int [] stack;
    public void add(int x){
        stack[++tt] = x;
    }
    public int pop(){
        return stack[tt--];
    }
    public int peak(){
        return stack[tt];
    }
    public boolean isEmpty(){
        return tt>0?false:true;
    }
}

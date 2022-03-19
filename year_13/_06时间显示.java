public class _06时间显示 {
    public static void main(String[] args) {
        getnResult(46811999);
    }
    public static int getnResult(long n){
        long target = n/1000;
        long s = target%60;
        long h = target/(60*60);
        long m = (target/60)%60;
        System.out.println("H "+h+"M: "+m+"S: "+s);
        return 0;
    }
}

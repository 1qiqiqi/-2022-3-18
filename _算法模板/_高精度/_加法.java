package _高精度;

public class _加法 {
    public static void main(String[] args) {
        //取数
        String a = "345",b = "324";
        int[] a_num = new int[a.length()];
        int[] b_num = new int[b.length()];
        for (int i=0;i<a_num.length;i++){
            a_num[i] = a.charAt(a_num.length-i-1);
        }
        for (int i=0;i<b_num.length;i++){
            b_num[i] = b.charAt(b_num.length-i-1);
        }
        int[] C = add(a_num, b_num);
        for (int i=C.length-1;i>=0;i--){
            System.out.print(C[i]+"");
        }

    }
    public static int [] add(int[] a,int [] b){
        int t = 0;//进位
        int [] C = new int[4];
        for (int i=0;i<a.length||i<b.length;i++){
            if (i<a.length)t += a[i];
            if (i<b.length)t += b[i];
            C[i] = t%10;
            t /= 10;
        }
        return C;
    }
}

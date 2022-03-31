package _KMP;

public class _字符串匹配 {
    public static void main(String[] args) {
        String s = "adadada";
        String p = "ad";
        int[] next = new int[p.length()];
        getNext(next,p);
        //kmp
        int j=0;
        for (int i=0;i<s.length();i++){
            while (j>0&&s.charAt(i)!=p.charAt(j)){
                j = next[j-1];
            }
            //相等的情况
            if (s.charAt(i)==p.charAt(j))j++;
            if (j==p.length()){
                System.out.println(i-p.length()+1);
                j = next[j-1];
            }

        }
    }
    public static void getNext(int [] next,String p){
      int j =0;
      next[0] =j;
      for (int i=1;i<p.length();i++){
          while (j>0&&p.charAt(i)!=p.charAt(j)){
              j = next[j-1];
          }
          if (p.charAt(i)==p.charAt(j))j++;
          next[i] = j;
      }
    }
}

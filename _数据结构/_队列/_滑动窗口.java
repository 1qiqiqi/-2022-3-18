package _队列;

public class _滑动窗口 {
    public static void main(String[] args) {
       int tt = -1,hh =0,k = 3;
       int [] nums  = new int[]{1 ,3 ,-1 ,-3 ,5 ,3, 6, 7};
       int [] queue = new int[100];
       for (int i=0;i<nums.length;i++){
           if (tt<=hh&&i-k+1>queue[hh]){
               hh++;
           }
           while (hh<=tt&&nums[i]>=nums[queue[tt]])tt--;
           queue[++tt] = i;
           if (i>=k-1){
               System.out.println(nums[queue[hh]]);
           }
       }
    }
}

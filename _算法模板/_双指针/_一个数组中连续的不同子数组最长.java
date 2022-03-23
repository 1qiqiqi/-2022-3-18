package _双指针;

import java.util.Map;

public class _一个数组中连续的不同子数组最长 {
    public static void main(String[] args) {
        int [] nums = {1,4,5,6,7,3,4,5,6,2,3,4,4,5};
        //双指针的模板
        int [] a = new int[nums.length];
        int res=0;
        for (int i =0,j=0;i<nums.length;i++){
            a[nums[i]]++;
            while (a[nums[i]]>1){
                a[nums[j]]--;
                j++;
            }
            res = Math.max(res,(i-j+1));
        }
        System.out.println(res);
    }
}

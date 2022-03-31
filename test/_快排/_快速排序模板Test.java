package _快排;

import org.junit.Test;

import static org.junit.Assert.*;

public class _快速排序模板Test {

    @Test
    public void main() {
        int[] nums = new int[]{1,2,7,6,6,9,11,22,33,55,66,77};
        quick_sort(nums, 0, nums.length - 1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l>=r){
            return;
        }
        int mid = getMid(nums, l, r);
        quick_sort(nums,l,mid-1);
        quick_sort(nums,mid+1,r);

    }

    private int getMid(int[] nums, int l, int r) {
        int x = nums[l];
        int i = l;
        int j= r;
        while (i<j){
            while (x<nums[j]&&i<j){
                j--;
            }
            while (x>=nums[j]&&i<j){
                i++;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        int temp = nums[j];
        nums[j] = nums[l];
        nums[l] = temp;
        return j;
    }


}
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void main() {
        int [] nums = new int[]{1,2,7,6,6,6,6,9,11,22,33};
        int[] temp = new int[nums.length];
        System.out.println(1/2);
        Sort(nums,0,nums.length-1,temp);
        for (int i:nums){
            System.out.print(i+" ");
        }
    }

    private void Sort(int[] nums, int i, int j, int[] temp) {
        if (i+1>=j){
            return;
        }
        int mid = (i+j)/2;
        Sort(nums,i,mid,temp);
        Sort(nums,mid+1,j,temp);
        Merge(nums,i,mid,j,temp);
    }

    private void Merge(int[] nums, int i, int mid, int j, int[] temp) {
        int index= 0;
        int l_start= i;
        int r_start = mid + 1;
        while (l_start<=mid&&r_start<=j){
            if (nums[l_start]<=nums[r_start]){
                temp[index++] = nums[l_start++];
            }else{
                temp[index++] = nums[r_start++];
            }
        }
        //是否左边排完
        while (l_start<=mid){
            temp[index++] = nums[l_start++];
        }
        //是否右边排完
        while (r_start<=j){
            temp[index++] = nums[r_start++];
        }
        //把数组放入到原数组当中
        for (int l=0;l<index;l++){
            nums[i+l] = temp[l];
        }
    }
}
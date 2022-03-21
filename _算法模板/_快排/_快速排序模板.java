package _快排;

public class _快速排序模板 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,7,6,6,9,11,22,33,55,66,77};
        quick_sort(nums, 0, nums.length - 1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    public static void quick_sort(int[] nums, int l, int r) {
        if (l>=r)return;
        int j = getMid1(nums,l,r);

        quick_sort(nums,l,j-1);
        quick_sort(nums,j+1,r);
    }

    private static int getMid1(int[] nums, int l, int r) {
        int x = nums[l];
        int i=l;
        int j= r;
        while (i<j){
            while (nums[j]>x&&i<j){
                j--;
            }
            while (nums[i]<=x&&i<j){
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

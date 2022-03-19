import java.lang.reflect.Array;

public class QuickSort {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,7,6,6,9,11,22,33,55,66,77};
        quick_sort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void quick_sort(int [] nums,int l,int r){
        if (l>=r)return;
        int mid = getMid(nums,l,r);
        quick_sort(nums,l,mid-1);
        quick_sort(nums,mid+1,r);

    }
    public static int getMid(int[] nums,int l,int r){
        int previe = nums[l];
        int first = l;
        int last = r;
        while (first!=last) {
            while (nums[last] > previe && first < last) {
                last--;
            }

            while (nums[first] <= previe && first < last) {
                first++;
            }

            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

        }
        int temp = nums[l];
        nums[l] = nums[last];
        nums[last] = temp;
        return last;
    }
}

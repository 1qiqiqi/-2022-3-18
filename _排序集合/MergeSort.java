public class MergeSort {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,7,6,6,9,11,22,33};
        int[] temp = new int[nums.length];
        System.out.println(1/2);
        Sort(nums,0,nums.length-1,temp);
        for (int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void Merge(int[] nums,int l,int m,int r,int[] temp){
        int i = 0;
        int l_start = l;//左边起始比较
        int r_start = m+1;//右边起始比较
        while (l_start<=m&&r_start<=r){
            if (nums[l_start]<nums[r_start]){
                temp[i++] = nums[l_start++];
            }else {
                temp[i++] = nums[r_start++];
            }
        }

        //是否左边排序完
        while (l_start<=m){
            temp[i++] = nums[l_start++];
        }
        //检查右边的
        while (r_start<=r){
            temp[i++] = nums[r_start++];
        }

        //再把数据放回原来的数组
        for (int t=0;t<i;t++){
            nums[l+t] = temp[t];
        }

    }
    public static void Sort(int[] nums,int l,int r,int[] temp){
        if (l+1>=r){
            return;
        }
        int m = (l+r)/2;
        //左排序
        Sort(nums,l,m,temp);
        //右排序
        Sort(nums,m+1,r,temp);
        //
        Merge(nums,l,m,r,temp);

    }
}

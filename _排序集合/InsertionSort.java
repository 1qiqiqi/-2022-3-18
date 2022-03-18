public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,7,6,6,9,11,22,33};
        Sort(nums);
        for (int i:nums){
            System.out.print(i+" ");
        }
    }
//这个完全是我自己的思路
    public static void Sort(int[] nums){
            for (int j=1;j<nums.length;j++){
                if (nums[j]>=nums[j-1])continue;//帅选后一个元素比前一个元素小的元素
                int temp = j;
                while (nums[temp]<nums[temp-1])
                {
                    temp--;
                }

                for (int i=j;temp + 1!=j;j--){
                    nums[j] = nums[j-1];
                }
//                int i;
//                for (i=j;nums[i]<nums[i-1];i--){
//                    nums[i] = nums[i-1];
//                }
                //互换
                int tmp = nums[j];
                nums[j] = nums[temp];
                nums[temp] = tmp;

        }
    }
}

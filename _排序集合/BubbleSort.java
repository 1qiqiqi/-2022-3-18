public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,7,6,6,9,11,22,33};
        Sort(nums);
        for (int i:nums){
            System.out.print(i+" ");
        }
    }

    private static void Sort(int[] nums) {
        boolean swapped;

        for (int i=1;i<nums.length;i++){
            swapped = false;
            for (int j=i;j<nums.length-i+1;j++){
                if (nums[j]<nums[j-1]){
                    int tmp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = tmp;
                }
            }
        }
    }
}

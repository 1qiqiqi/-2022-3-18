public class InsertionSort1 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,7,6,6,9,11,22,33};
        Sort(nums);
        for (int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void Sort(int[] nums){
        for(int i=1;i<nums.length;i++){
            for (int j=i;nums[j]<nums[j-1];j--){
                int tmp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = tmp;
            }
        }
    }
}

public class test {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,6,6,6,6,7,9};
        int l = 0,r = nums.length-1;
        int x = 6;
        while (l<r){
            int mid =(l+r)/2;
            if (x<=nums[mid])r = mid;
            else l = mid + 1;
        }
        System.out.println(r);
        int i =0,j = nums.length-1;
        while (i<j){
            int mid = 1+(i+j)/2;
            if (x>=nums[mid])i=mid;
            else j = mid -1;
        }
        System.out.println(i);
    }
}

package _二分;

public class _二分模板 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,6,6,6,6,7,9};
        int l = 0,r = nums.length-1;
        int x=6;
        while (l<r){//6出现的第一次位置
            int mid = 1+(r+l)/2;//加一防止死循环
            if (nums[mid]<=x)l=mid;
            else r = mid - 1;
        }
        System.out.println(l);//输出l和r都行 上面的循环结束的r和l是想等的
        int i = 0,j=nums.length-1;
        while (i<j){//6最后一次出现的位置
            int mid = (i+j)/2;
            if (nums[mid]>=x)j = mid;
            else i = mid + 1;
        }
        System.out.println(i);
        //处理浮点数二分
        double y =10;
        double left =0;
        double right = y;
        while (left<right){
            double mid = (right+left)/2;
            if (mid*mid<=y)left=mid;
            else right = mid;
        }
        System.out.println(right);

    }
}

public class _08幸运数 {

    public static void main(String[] args) {
        getResult(3,52);
    }

    public static void getResult(int a,int b){
        int[] nums = new int[b/2+1];//创建一个数组
        for (int i=0;i<=b/2;i++){//建立基数数组
            nums[i] = 2*i + 1;
        }
        for (int i:nums){
            System.out.print(i+" ");
        }
        System.out.println("==========");
        int luck = 1;
        while(true) {
            int p = luck+1;
            for (int i = luck + 1; i < nums.length; i++) {//第一轮
                if ((i + 1) % nums[luck] == 0) {
                } else {
                    nums[p++] = nums[i];
                }
            }
            for (int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
            luck++;
            //退出条件

            if (nums[luck]>=b)break;
        }
        System.out.println(luck);
        int ans=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]>=b) break;
            if (nums[i+1]<nums[i]){
                ans++;
                break;
            }
            if (nums[i]>a) ans++;
        }
        System.out.println(ans);
        }
    }


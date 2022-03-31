public class _第三题枚举数列求值 {
    public static void main(String[] args) {
//        long fn = fn(20190324);
//        System.out.println(fn);
//        long res = 0;
//        long[] list = new long[20190324];
//        list[0] = 1;
//        list[1] = 1;
//        list[2] = 1;
//        for (int i = 3; i < 20190324; i++) {
//            list[i] = (list[i - 1] + list[i - 2] + list[i - 3]) % 10000;
//        }
//        System.out.println(list[20190323]);
//    }
//        =========================
        long [] list = new long[3];
        list[0] = 1;
        list[1] = 1;
        list[2] = 1;
        for (int i=4;i<=20190324;i++){
            list[i%3] =  (list[0]+list[1]+list[2])%10000;
        }
        System.out.println(list[20190324%3]);
    }
//        public static long fn(long n){
//            if (n == 1 || n == 2 || n == 3) {
//                return 1;
//            }
//            return fn(n - 1) + fn(n - 2) + fn(n - 3);
////        return 2*fn(n-1)-fn(n-4);
//        }
    }
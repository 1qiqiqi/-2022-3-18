public class _03有理数类 {
    class Radition{
        private int a;
        private int b;

        public Radition(int a, int b) {
            this.a = a;
            this.b = b;
            int gcd = gcd(a, b);
            if (gcd>1){
                this.a /= gcd;
                this.b /= gcd;
            }


        }
        public int gcd(int a,int b){
            if (b==0)return a;
            return gcd(b,a%b);
        }

        public Radition add(Radition another){
            return new Radition((this.a*another.b+this.b*another.a),(this.b*another.b));
        }

    }
}

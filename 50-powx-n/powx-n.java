class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if( N < 0){
            N = -N;
            x = 1 / x;
        }

       double ans = 1;

        while( N > 0 ){
            if( N % 2 == 1 ){
                ans = ans * x;
                N = N - 1;
            }
            else{
                N = N / 2;
                x = x * x;
            }
        }
       return ans;
    }
}
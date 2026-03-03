class Solution {
    public int fib(int n) {
        int a= 0;
        int b= 1;
      int sum=0;
       if(n==1) return 1;
       
       for(int i=2; i<=n; i++){
        sum= a+b;
        int temp= sum;
        a=b;
        b=sum;

       }
       return sum;
    }
}
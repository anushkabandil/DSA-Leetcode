class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        }while(slow != fast);

        if(slow == 1) {
            return true;
        } 
        else return false;
    }

    private int findSquare(int n){
        int ans = 0;
        while(n>0){
            int rem = n % 10;
            ans = ans + rem * rem;
            n = n/10;
        }
        return ans;
    }
}
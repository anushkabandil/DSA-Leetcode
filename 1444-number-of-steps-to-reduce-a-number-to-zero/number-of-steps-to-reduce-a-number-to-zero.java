class Solution {
    public int numberOfSteps(int num) {
        return fun(num);
    }
    static int fun(int num){
        return helper(num,0);
    }
    static int helper(int num, int count){
            if(num == 0){
                return count;
            }

            if(num% 2 == 0){
                return helper(num/2 , count+1);
            }
            else return helper(num-1 , count+1);
        }

}
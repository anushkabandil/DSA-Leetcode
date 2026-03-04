class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int max_len = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) {
                currentCount++;
               max_len =  Math.max( currentCount, max_len);
            }
            else{
                currentCount = 0 ;
            }
        }
        return max_len;
    }
}
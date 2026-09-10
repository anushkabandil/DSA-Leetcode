class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = nums[0];

        for(int i = 1; i < n ; i++){
            result[i] = nums[i] + result[i - 1];
        }
        
        return result;
    }
}
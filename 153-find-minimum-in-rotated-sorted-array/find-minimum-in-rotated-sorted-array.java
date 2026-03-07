class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i = 0; i<nums.length; i++){
             int current = nums[i]; 
             min = Math.min(current,min);
        }
        return min;
    }
}
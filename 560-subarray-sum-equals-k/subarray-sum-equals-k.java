class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
       for(int i =0; i<nums.length; i++){
            int sum = 0;
            // means if a single number nums[i] equals k; taking such scenarios we use j=i.
            for(int j = i; j<nums.length; j++ ){
               sum += nums[j];
                if(sum == k){
                    count++;
                }
            }   
        }
        return count;
    }
}
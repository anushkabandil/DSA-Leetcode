class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> table = new HashMap<>();
      for(int i=0; i<nums.length; i++){
        int remainder = target- nums[i];

        if(table.containsKey(remainder)){
            return new int[]{ table.get(remainder),i};
        }
        table.put(nums[i],i);
      }
        return new int[] {-1,-1};
    }
}
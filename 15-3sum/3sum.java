class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            Set<Integer> hashSet = new HashSet<>();

            for(int j=i+1; j<nums.length; j++){
                int k = -(nums[i]+nums[j]);

               if( hashSet.contains(k) ){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(temp);
                    ans.add(temp);
               }

               hashSet.add(nums[j]);
            }
        }
       return new ArrayList<>(ans); 
    }
}
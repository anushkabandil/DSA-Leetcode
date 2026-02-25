class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
       Map<Integer,Integer> map = new HashMap<>();
       for(int num : nums){
            int complement = k-num;
            
            if (map.getOrDefault(complement,0)>0){
                count++;
                map.put(complement, map.get(complement)-1);
            }
            else{
                map.put(num, map.getOrDefault(num,0)+1);
            }
       }
      
        return count;
    }
}
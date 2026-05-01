class Solution {
    public int subarraySum(int[] nums, int k) {
    //     int count = 0;
    // // Traverse all possible end indices from start
    //    for(int i =0; i<nums.length; i++){
    //         int sum = 0;
    //         // means if a single number nums[i] equals k; taking such scenarios we use j=i.
    //         for(int j = i; j<nums.length; j++ ){
    //            sum += nums[j];
    //             if(sum == k){
    //                 count++;
    //             }
    //         }   
    //     }
    //     return count;







    // METHOD-2----------------------------------------------------------

    int n = nums.length;
    int count = 0;
    int prefixSum =0;

    Map <Integer, Integer> map = new HashMap<>();
    map.put(0,1);

    for(int i =0; i<n; i++){
        // Add current element to prefix sum
        prefixSum += nums[i];
        // Calculate the prefix sum that needs to be removed
        int remove = prefixSum - k;

        // If this prefix sum has been seen before,
            // add its count to the result
        if(map.containsKey(remove)){
            count += map.get(remove);
        }
        map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
    }
    return count;
    }
}
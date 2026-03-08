class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot =-1;
       
        for(int right = nums.length-2; right>=0; right--){
            if(nums[right]<nums[right+1]){
                pivot = right;
                break;
            }
        }

        if(pivot != -1){
            for(int j = n - 1; j > pivot; j--){
                if(nums[j] > nums[pivot]){
                    int temp = nums[j];
                    nums[j] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }

        // 3. Reverse the suffix
        int left = pivot + 1;
        int right = n - 1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
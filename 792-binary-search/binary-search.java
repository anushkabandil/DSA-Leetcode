class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        return binary(0, n ,target, nums);
    }

    public int binary(int start, int end, int target, int[] nums){

        if(start > end ) return -1;
        int mid = start +((end - start) / 2);

        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return binary(mid+1, end, target , nums);
        else return binary( start, mid-1,target, nums);
    }
}
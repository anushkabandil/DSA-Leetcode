class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        generate( nums, 0, list, ans);


        return ans;
    }

    public void generate( int[] nums, int index, List<Integer> list, List<List<Integer>> ans){

        if( index == nums.length){
            ans.add( new ArrayList<>(list) );
            return;
        }

        
        for( int i = 0; i < nums.length; i++){

            if( list.contains( nums[i]) )continue;

            list.add( nums[i]);

            generate( nums, index + 1, list, ans);

            list.remove( list.size() - 1 );

        }

    }
}
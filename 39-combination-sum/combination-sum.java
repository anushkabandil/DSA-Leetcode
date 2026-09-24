class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        generate( candidates, target, 0, 0, list, ans);

        return ans;
    }

    public void generate( int[] candidates, int target, int index, int sum, List<Integer> list, List<List<Integer>> ans ){

        if( sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(index == candidates.length)return;

        if( sum > target)return;

            list.add( candidates[index]);

            generate( candidates, target, index, sum + candidates[index], list, ans);

            list.remove( list.size() - 1);

             generate(candidates, target, index + 1, sum, list, ans);
    }
}
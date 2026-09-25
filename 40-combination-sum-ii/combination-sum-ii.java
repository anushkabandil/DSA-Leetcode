class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        generate( candidates, target, 0, 0, list, ans);

        return ans;
    }

    public void generate ( int [] candidates, int target, int index, int sum, List<Integer> list, List<List<Integer>> ans ){
        
        if( sum == target){
            ans.add( new ArrayList<>(list));
            return;
        }

        if( sum > target )return;

        if( index == candidates.length )return;

       for( int i = index; i < candidates.length; i++){

            if( i > index && candidates[i] == candidates[ i - 1 ] ) continue;

            if( sum + candidates[i] > target) break;

            list.add( candidates[i]);

            generate( candidates, target, i + 1, sum + candidates[i], list, ans);

            list.remove( list.size() - 1);
       }
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {

        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        generate( n, sb, 0, 0, list );

        return list;
        
    }

    public void generate( int n, StringBuilder sb, int open, int close, List<String> list){

        if( open == n && close == n){
            list.add(sb.toString());
            return ;
        }

        if( open < n ){
            sb.append("(");
            generate( n, sb, open + 1, close, list);
            sb.deleteCharAt( sb.length() - 1 );
        }

        if(close < open ){
            sb.append(")");
            generate( n, sb, open, close + 1, list);
            sb.deleteCharAt( sb.length() - 1 );
        }
    }
}
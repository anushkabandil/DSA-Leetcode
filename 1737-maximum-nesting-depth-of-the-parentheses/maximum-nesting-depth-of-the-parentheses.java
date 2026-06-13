class Solution {
    public int maxDepth(String s) {
        int currentCount = 0;
        int maxCount = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') currentCount++;
            if( ch == ')') currentCount--;

            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
}
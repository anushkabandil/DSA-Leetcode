class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastSeen[c] >= left) {
                left = lastSeen[c] + 1;
            }

            lastSeen[c] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
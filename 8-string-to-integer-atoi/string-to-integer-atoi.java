class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        // 1. Skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3. Call recursive function
        return helper(s, i, sign, 0);
    }

    private int helper(String s, int i, int sign, int result) {

        // Base case: end OR non-digit
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return result * sign;
        }

        int digit = s.charAt(i) - '0';

        // Overflow check
        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        // Build number
        result = result * 10 + digit;

        // Recursive call
        return helper(s, i + 1, sign, result);
    }
}
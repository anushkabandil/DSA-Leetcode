class Solution {
    public void reverseString(char[] s) {

        solve( s, 0, s.length - 1);
    }

    public void solve( char [] s, int low, int high){

        int len = high - low + 1;
        if( len == 0 || len == 1) return;

        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;

        solve( s, low + 1, high - 1);

    }
}
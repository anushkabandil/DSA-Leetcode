class Solution {
    public void reverseString(char[] s) {

      recursion(s, 0, s.length - 1 );
    }

    public void recursion(char[] s, int low, int high){
    
        if( low < high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            recursion(s, low + 1, high - 1);
        }
        else return;
    }
}
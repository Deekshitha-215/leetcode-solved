// Last updated: 1/26/2026, 5:16:58 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return ((n>0 && ((n&(n-1))==0)) && (n%3==1));
        
    }
}
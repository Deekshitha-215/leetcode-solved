// Last updated: 1/26/2026, 5:17:05 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && ((n&(n-1))==0));
        
    }
}
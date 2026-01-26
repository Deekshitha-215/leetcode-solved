// Last updated: 1/26/2026, 5:17:11 PM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5) {
            count+=n/5;
            n/=5;
        }
        return count;
    }
}
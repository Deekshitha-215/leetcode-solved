// Last updated: 1/26/2026, 5:17:08 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0) {
            n=(n&(n-1));
            count++;
        } 
        return count;
    }
}
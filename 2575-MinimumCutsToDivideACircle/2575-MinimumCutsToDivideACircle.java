// Last updated: 1/26/2026, 5:16:13 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        else return n;
        
    }
}
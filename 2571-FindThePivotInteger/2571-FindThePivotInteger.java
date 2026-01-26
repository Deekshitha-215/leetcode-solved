// Last updated: 1/26/2026, 5:16:15 PM
class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        int s=(int)Math.sqrt(total);
        if((s*s)==total) return s;
        else return -1;
    }
}
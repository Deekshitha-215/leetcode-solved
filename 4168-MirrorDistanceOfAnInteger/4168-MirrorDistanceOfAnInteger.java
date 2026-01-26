// Last updated: 1/26/2026, 5:15:51 PM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int original=n;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return Math.abs(original-rev);
    }
}
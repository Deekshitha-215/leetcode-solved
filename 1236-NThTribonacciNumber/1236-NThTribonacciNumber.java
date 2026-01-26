// Last updated: 1/26/2026, 5:16:37 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0||n==1) return n;
        if(n==2) return 1;
        int prev1=0, prev2=1, prev3=1, next=0;
        for(int i=1;i<n-1;i++) {
            next=prev1+prev2+prev3;
            prev1=prev2;
            prev2=prev3;
            prev3=next;
        }
        return next;   
    }
}
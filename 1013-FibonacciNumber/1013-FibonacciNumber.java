// Last updated: 1/26/2026, 5:16:41 PM
class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int prev1=0, prev2=1, next=0;
        for(int i=1;i<n;i++){
            next=prev1+prev2;
            prev1=prev2;
            prev2=next;
        }
        return next;
        
    }
}
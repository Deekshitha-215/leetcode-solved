// Last updated: 1/26/2026, 5:16:19 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int min=a<b?a:b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
}
// Last updated: 1/26/2026, 5:16:05 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if(k<=(numOnes+numZeros)) return numOnes;
        else {
            int rem=k-(numOnes+numZeros);
            return numOnes-rem;
        }
        
    }
}
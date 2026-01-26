// Last updated: 1/26/2026, 5:16:53 PM
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row) {
            n-=row;
            row++;
        }
        return row-1;
        
    }
}
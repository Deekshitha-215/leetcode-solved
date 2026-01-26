// Last updated: 1/26/2026, 5:17:03 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return num%9==0?9:num%9;
        
    }
}
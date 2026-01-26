// Last updated: 1/26/2026, 5:17:12 PM
class Solution {
    public int titleToNumber(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res*26 + s.charAt(i)-64;
        }
        return res;
    }
}
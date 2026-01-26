// Last updated: 1/26/2026, 5:15:53 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for(int x:nums) {
            if(x<10) sd+=x;
            else dd+=x;
        }
        if(sd!=dd) return true;
        else return false;
        
    }
}
// Last updated: 1/26/2026, 5:15:58 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int x:hours){
            if(x>=target) count++;
        }
        return count;
    }
}
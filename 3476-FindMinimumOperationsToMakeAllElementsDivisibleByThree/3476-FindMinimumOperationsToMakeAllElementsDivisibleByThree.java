// Last updated: 1/26/2026, 5:15:50 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int x:nums){
            if(x%3==0) {
               
            } else {
                count++;
            }
        }
        return count;
    }
}
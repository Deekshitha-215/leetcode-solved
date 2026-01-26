// Last updated: 1/26/2026, 5:17:19 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int ms=nums[0];
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(cs>ms)
                ms=cs;
            if(cs<0)
                cs=0;
        }
        return ms;
    }
}
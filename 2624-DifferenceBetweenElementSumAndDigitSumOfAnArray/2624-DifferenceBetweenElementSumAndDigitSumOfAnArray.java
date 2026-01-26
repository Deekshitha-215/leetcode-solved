// Last updated: 1/26/2026, 5:16:10 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int x:nums){
            esum+=x;
            while(x!=0){
                dsum+=x%10;
                x/=10;
            }
        }
        return esum-dsum;
    }
}
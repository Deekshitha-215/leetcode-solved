// Last updated: 1/26/2026, 5:16:17 PM
class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int x:nums){
            if(x%2==0 && x%3==0){
                sum +=x;
                count++;
            }
        }
        if(count==0) return 0;
        else return sum/count;
    }
}
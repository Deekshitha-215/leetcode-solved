// Last updated: 6/19/2026, 10:08:32 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int len=gain.length;
4        int [] nums=new int[len+1];
5        nums[0]=0;
6        nums[1]=gain[0];
7        int sum=0;
8        for(int i=1;i<len;i++)
9        {
10            sum=gain[i]+nums[i];
11            nums[i+1]=sum;
12        }
13        int big=nums[0];
14        for(int i=0;i<nums.length-1;i++)
15        {
16            if(big > nums[i+1]);
17            else
18            big=nums[i+1];
19        }
20        return big;
21    }
22}
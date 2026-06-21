// Last updated: 6/21/2026, 8:58:05 AM
1class Solution {
2    public int countValidSubarrays(int[] nums, int x) {
3        int n=nums.length;
4        int count=0;
5        for(int i=0;i<n;i++)
6        {
7            long sum=0;
8            for(int j=i;j<n;j++)
9            {
10                sum+=nums[j];
11                if(sum%10==x && firstdigi(sum)==x)
12                {
13                    count++;
14                }
15            }
16        }
17        return count;
18    }
19    private int firstdigi(long sum)
20    {
21        while(sum>=10)
22        {
23            sum/=10;
24        }
25        return (int) sum;
26    }
27}
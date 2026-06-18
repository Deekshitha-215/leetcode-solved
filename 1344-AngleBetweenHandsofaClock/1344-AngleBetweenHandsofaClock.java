// Last updated: 6/18/2026, 11:45:01 PM
1class Solution {
2    public double angleClock(int hr, int min) {
3        double temp=min;
4        double a= hr*30;
5        double b= temp*11/2;
6        double ans = Math.abs(a-b);
7        if(ans > 180)
8        ans=360-ans;
9        return ans;
10    }
11}
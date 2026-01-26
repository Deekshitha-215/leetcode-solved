// Last updated: 1/26/2026, 5:15:55 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int org=x;
        int sum=0;
        while(x!=0){
            int d=x%10;
            sum+=d;
            x/=10;
        }
        if(org % sum == 0) return sum;
        else return -1;
    }
}
// Last updated: 1/26/2026, 5:16:12 PM
class Solution {
    public int countDigits(int num) {
        int c=num;
        int count=0;
        while(num!=0){
            int d=num%10;
            if(c%d==0) count++;
            num/=10;
        }
        return count;
    }
}
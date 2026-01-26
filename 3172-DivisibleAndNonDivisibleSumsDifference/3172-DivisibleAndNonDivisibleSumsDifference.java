// Last updated: 1/26/2026, 5:15:56 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2+=i;
            } else {
                num1+=i;
            }
        }
        return num1-num2;
    }
}
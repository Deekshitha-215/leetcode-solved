// Last updated: 1/26/2026, 5:15:59 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int total=0;
        while(mainTank>=5){
            total+=50;
            mainTank-=5;
            if(additionalTank>=1) {
                mainTank++;
                additionalTank--;
            }    
        }
        return total+=mainTank*10;
    }
}
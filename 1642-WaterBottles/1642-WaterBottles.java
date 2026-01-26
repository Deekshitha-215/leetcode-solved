// Last updated: 1/26/2026, 5:16:32 PM
class Solution {
    public int numWaterBottles(int NB, int NE) {
        int drink=NB;
        int empty=NB;
        while(empty>=NE){
            int newD=empty/NE;
            empty=(empty%NE)+newD;
            drink+=newD;
        }
        return drink;
    }
}
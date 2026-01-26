// Last updated: 1/26/2026, 5:16:36 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evencount=0;
        int oddcount=0;
        for(int pos:position){
            if(pos%2==0){
                evencount++;
            } else {
                oddcount++;
            }
        }
        return evencount<oddcount?evencount:oddcount;
    }
}
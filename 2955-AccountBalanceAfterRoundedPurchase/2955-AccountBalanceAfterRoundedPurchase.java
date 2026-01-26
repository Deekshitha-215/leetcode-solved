// Last updated: 1/26/2026, 5:15:57 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10<=4) return 100-(purchaseAmount/10)*10;
        else return 100-((purchaseAmount/10)+1)*10;
        
    }
}
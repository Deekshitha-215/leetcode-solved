// Last updated: 1/26/2026, 5:17:13 PM
class Solution {
    public String convertToTitle(int num) {
        StringBuffer ans= new StringBuffer();
        while(num>0){
            num--;
            ans.append((char)((num%26)+65));
            num/=26;
        }
        return ans.reverse().toString();
    }
}
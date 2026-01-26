// Last updated: 1/26/2026, 5:16:56 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[123];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
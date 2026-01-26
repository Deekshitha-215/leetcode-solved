// Last updated: 1/26/2026, 5:16:38 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int cmax=-1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>cmax) cmax=arr[i];
            arr[i]=max;
            max=cmax;
        }
        return arr;
    }
}
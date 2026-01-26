// Last updated: 1/26/2026, 5:16:04 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
        
    }
}
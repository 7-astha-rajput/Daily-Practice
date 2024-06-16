class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;  // minimum possible speed
        int right = getMax(piles);  // maximum possible speed (largest pile)
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, mid, h)) {
                right = mid;  // try a smaller speed
            } else {
                left = mid + 1;  // increase the speed
            }
        }
        
        return left;  // left will be the minimum speed at the end of binary search
    }
    
    // Helper method to get the maximum value in the piles
    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }
    
    // Helper method to determine if Koko can eat all bananas at speed k in h hours
    private boolean canEatAll(int[] piles, int k, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;  // equivalent to Math.ceil(pile / k)
            if (hours > h) {
                return false;  // early exit if hours exceed h
            }
        }
        return true;
    }
}

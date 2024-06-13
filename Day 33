class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // Peak element is in the left half including mid
                right = mid;
            } else {
                // Peak element is in the right half excluding mid
                left = mid + 1;
            }
        }
        // left and right will eventually converge to the peak element
        return left;
    }
}

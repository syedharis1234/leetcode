class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  // To store the maximum count of consecutive 1's
        int currentCount = 0;  // To store the current count of consecutive 1's
        
        // Iterate through the array
        for (int num : nums) {
            if (num == 1) {
                // If we encounter a 1, increase the current count
                currentCount++;
            } else {
                // If we encounter a 0, update maxCount and reset currentCount
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        
        // After the loop, we need to check one more time in case the array ends with 1's
        return Math.max(maxCount, currentCount);
    }
}

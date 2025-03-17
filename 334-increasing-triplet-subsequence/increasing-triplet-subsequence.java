class Solution {
    public boolean increasingTriplet(int[] nums) {
    
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num;  // Smallest element so far
            } else if (num <= second) {
                second = num; // Second smallest element found
            } else {
                return true;  // Found a third number greater than both
            }
        }
        
        return false;
    }
}


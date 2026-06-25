class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        for (int num : nums) {
            if (num >= target)
                return 1;
        }

        for (int wS = 2; wS <= nums.length; wS++) {

          
            int sum = 0;
            for (int i = 0; i < wS; i++) {
                sum += nums[i];
            }

            if (sum >= target)
                return wS;

            for (int right = wS; right < nums.length; right++) {
                sum += nums[right];
                sum -= nums[right - wS];

                if (sum >= target)
                    return wS;
            }
        }

        return 0;
    }
}
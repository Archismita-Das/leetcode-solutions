class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        for(int i=0; i < nums.length; i++){
            int take = prev2+ nums[i];
            int skip = prev1;
            int curr = Math.max(take,skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
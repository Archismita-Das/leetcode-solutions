class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        
        int case1 = robs(nums,0,n-2);
        int case2 = robs(nums,1,n-1);

        return Math.max(case1,case2);

    }

    public int robs(int[]nums, int start, int end){
        int prev2 = 0;
        int prev1 = 0;
        for(int i=start; i<=end; i++){
            int take = prev2+nums[i];
            int skip = prev1;
            int curr = Math.max(take,skip);

            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
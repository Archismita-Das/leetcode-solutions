class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int curr=0;
        for(int n:nums){
            if(n==1){
                curr++;
            }
            else{
                max=Math.max(max,curr);
                curr=0;
            }
        }
        return max>curr ? max:curr;
    }
}
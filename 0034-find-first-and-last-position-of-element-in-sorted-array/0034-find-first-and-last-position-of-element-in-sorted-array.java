class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums,target, true);
        int last = findPosition(nums,target,false);
        return new int[]{first,last};
    }
    private int findPosition(int[] nums, int target, boolean findFirst){
        int left = 0 , right = nums.length-1;
        int ans = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                ans = mid;
                if(findFirst) right = mid-1;
                else left = mid+1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
            
        }
        return ans;
    }
}
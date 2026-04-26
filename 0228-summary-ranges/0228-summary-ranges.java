import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        if (nums.length == 0) return res;

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {

            // Break in sequence OR end of array
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {

                if (start == nums[i - 1]) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(start + "->" + nums[i - 1]);
                }

                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return res;
    }
}
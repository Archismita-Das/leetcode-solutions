import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int remaining, 
                           List<Integer> temp, 
                           List<List<Integer>> result) {

        // If combination size is k and sum is exactly n
        if (temp.size() == k && remaining == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // If size exceeds k or sum becomes negative
        if (temp.size() > k || remaining < 0) {
            return;
        }

        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {
            temp.add(i);                      // choose
            backtrack(i + 1, k, remaining - i, temp, result); // explore
            temp.remove(temp.size() - 1);    // unchoose
        }
    }
}

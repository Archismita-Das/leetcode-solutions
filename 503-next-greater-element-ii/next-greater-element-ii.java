class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] NextGreatest = new int[n];
        for(int i=2*n-1;i>=0;i--){
            int CurrentNumber = nums[i%n];

            while (!stack.isEmpty() && stack.peek()<=CurrentNumber){
                        stack.pop();
                    }
                    if(i<n){
                    if (stack.isEmpty()) {
                NextGreatest[i] = -1;
            }
            else {
                NextGreatest[i] = stack.peek();
            }
        }
              stack.push(CurrentNumber);
        }
        return NextGreatest;
    }
} 
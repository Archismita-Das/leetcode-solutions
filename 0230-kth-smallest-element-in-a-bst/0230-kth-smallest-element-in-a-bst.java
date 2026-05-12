class Solution {

    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {

        inorder(root, k);

        return ans;
    }

    public void inorder(TreeNode root, int k) {

        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, k);

        // Root
        count++;

        if (count == k) {
            ans = root.val;
            return;
        }

        // Right
        inorder(root.right, k);
    }
}
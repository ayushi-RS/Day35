class Solution {
int ans = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        return ans;
    }
    
    void solve(TreeNode root) {
        if(root == null) return;
        solve(root.left);
        if(prev != null) {
            ans = Math.min(ans, Math.abs(root.val - prev.val));
        }
        prev = root;
        solve(root.right);
    }
}